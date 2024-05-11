package DynamicProgramming;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        int bruteRes = bruteFibo(5);
        System.out.println(bruteRes); //for input 50 this will take hell a lot of time, and also we have to pass long to maintain the range

        int memoRes = memoFibo(5);
        System.out.println(memoRes);

        /*Now most optimized approach will be tabulation which will reduce the space O(N) to O(1)
        * iff we only need that nth fibonacci number else it will similar to memoization */
        int tabuRes = tabuFiboNum(5);
        System.out.println(tabuRes);

        tabuFiboSeries(5);
        System.out.println(Arrays.toString(dp));


    }


    private static int[] dp;
    private static int tabuFiboSeries(int n) {
        dp = new int[n+1]; //maintaining for the series
        dp[0] = 0; //prev
        dp[1] = 1; //curr
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2]; //next = curr + prev
        }
        return dp[n];

        /*if we observe closely then we can find actually we are using 3 variables
         *curr ,prev and next nums of the fibonacci nums
         * and calculating next number by curr and prev variable,
         * so this logic is implemented in below function which only return nth fibonacci number*/
    }
    private static int tabuFiboNum(int n) {
        int prev = 0, curr=1;
        for(int i=2; i<=n; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
        //This reduces the space complexity from O(n) to O(1),
        // making the solution more efficient in terms of memory usage.
    }

    private static int[] memo;
    private static int memoFibo(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return helperFib(n);
    }

    private static int helperFib(int n) {
        if(n<=1) return n;
        //checking for repeating function call
        if(memo[n] != -1) return memo[n];
        /*
        * Similar approach to brute force but here repeating calls will only execute once
        * so the time will reduced to O(N) from O(2^N).
        * This demonstrates the optimal substructure property of dynamic programming.*/
        return memo[n] = helperFib(n-1) + helperFib(n-2);

    }


    private static int bruteFibo(int n) {
        if(n<=1) return n;
        return bruteFibo(n-1)+bruteFibo(n-2);
    }
}
