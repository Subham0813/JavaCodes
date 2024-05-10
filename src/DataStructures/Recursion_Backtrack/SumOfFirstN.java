package DataStructures.Recursion_Backtrack;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumFirstN(10000018));
    }
    public static long sumFirstN(long n) {
        // Write your code here.
        if(n==0) return 0;
        return (n + sumFirstN(n-1));
    }
}
