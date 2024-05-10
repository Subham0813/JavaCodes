package DataStructures.Recursion_Backtrack;
import java.util.Scanner;

public class p2_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++) {
            System.out.print(fact(i) + " ");
        }

    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
            return n * fact(n - 1);
    }
}
