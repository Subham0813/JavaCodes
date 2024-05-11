package DataStructures.Recursion_Backtrack;

public class CountGoodNumbers {
    static  long total = 0;
    public static void main(String[] args) {

        long n= 4;
        int[] primes = {2,3,5,7};
        int[] evens = {0,2,4,6,8};
        counting(evens, primes, n, 0);
        System.out.println(total);
        System.out.println(50%(1000000000 + 7));
    }
    static void counting (int[] even, int[] prime, long n, long count){

        if(count == n){
            total ++;
            return;
        }

        //if count is even inclue any num from even exclude prime
        if(count % 2 == 0) {

            for(int i : even)
                counting(even, prime, n, count + 1);
        }
        //if count is odd include any num from prime exclude even
        if(count % 2 != 0) {
            for(int j :prime)
                counting(even, prime, n, count + 1);
        }
    }
}
