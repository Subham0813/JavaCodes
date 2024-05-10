package Others;

import java.util.Scanner;

public class Machli {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Kitni Machli ?? Ans --> ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.println(i + " Machli 🐠");
            }
            for(int j=1; j<=i; j++){
                System.out.println("pani mein gayi 🌊");
            }
            for(int j=1; j<=i; j++){
                System.out.println("chhapak 💦");
            }
        }
    }
}
