package DynamicProgramming;

import java.util.*;

public class coinChange {
    public static void main(String[] args) {
        int[] coins ={1,2,5,10};
        coinNeededRec(coins,13,0); //using recursion TC --> O(2^N), SC --> O(N)
        System.out.println(minCount);

        System.out.println(coinNeededMemo(coins, 126)); // this will give **java.lang.StackOverflowError
        //because the recursive call stack will overflow for large amount (k) so,
        // optimal approach will be iterative approach with maintaining result in a dp array i.e. (bottom up approach)

        System.out.println(coinNeedDP(coins,104));

    }

    private static int coinNeedDP(int[] coins, int num) {
        int[] dp = new int[num+1];
        Arrays.fill(dp,num+1);//--> taking this only check afterwards that if num -coin >=0 or not
        dp[0] = 0;
        // or
        //Arrays.fill(dp, -1); //--> taking this, check afterwards that if num -coin >=0 && dp[num - coin]!= -1

        for(int k=1; k<=num; k++){
            for(int coin : coins) {
                if (k - coin >= 0) dp[k] = Math.min(dp[k], dp[k - coin] + 1);
            }
        }

        return dp[num]>num? -1: dp[num];
    }

    private static int coinNeededMemo(int[] coins, int k) {
//        int[] memo = new int[k+1];
//        Arrays.fill(memo,-1);
//        return coinNeedHelperArr(coins, k, memo); // memo array is useful when amount is small

        //if amount is very big then we should use Map interface,
        // which is optimal in all case either small or large amount
        Map<Integer,Integer> memo = new HashMap<>();
        return coinNeedHelperMap(coins, k, memo);

    }
    private static int coinNeedHelperArr(int[] coins, int k, int[] memo) {
        if(k==0) return 0;
        if(k<0) return -1;
        if(memo[k] != -1) return memo[k];

        int minCount = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = coinNeedHelperArr(coins, k-coin, memo);
            if(res>=0 && res<minCount) minCount = res +1;
        }
        return memo[k] = (minCount == Integer.MAX_VALUE)? -1: minCount;

    }
    private static int coinNeedHelperMap(int[] coins, int k, Map<Integer,Integer> memo) {
        if (k == 0) return 0;
        if (k < 0) return -1;
        if (memo.containsKey(k)) return memo.get(k);

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinNeedHelperMap(coins, k - coin, memo);
            if (result != -1) min = Math.min(min, result + 1);
        }
        memo.put(k, min == Integer.MAX_VALUE ? -1 : min);
        return memo.get(k);
    }


    static int minCount = Integer.MAX_VALUE;
    private static void coinNeededRec(int[] coins, int target, int count) {
        if(target == 0){
            minCount = Math.min(minCount,count);
            return;
        }

        for(int i=0; i<coins.length; i++){
            if(coins[i]<=target) coinNeededRec(coins,target-coins[i],count+1);
        }
    }


}
