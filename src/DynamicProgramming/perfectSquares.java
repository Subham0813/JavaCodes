package DynamicProgramming;
import java.util.*;

public class perfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(99));
    }
    static int[] dp;
    public static int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return helper(n);
    }
    static int helper(int n){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];

        int res = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            res = Math.min(res, 1+helper(n-i*i));
        }

        return dp[n] = res;
    }
}
