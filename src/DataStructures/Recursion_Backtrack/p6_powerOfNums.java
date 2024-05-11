package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p6_powerOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();

        System.out.println(powerValue(p,q));
        System.out.println(powerValueEfficient(p,q));
    }

    static int powerValue(int p,int q){
        if(q==0) return 1; //base case

        return powerValue(p,q-1)*p; //recursive case
    }
    static int powerValueEfficient(int p, int q){
        if(q==0) return 1; //base case
        if(q%2 == 0) {                 //recursive case
            return powerValueEfficient(p,q/2)*powerValueEfficient(p, q/2);
        } else {
            return p*powerValueEfficient(p,q/2)*powerValueEfficient(p,q/2);
        }
    }
}
