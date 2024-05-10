package ConditionalStatement;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter range: 1 to ");
        int n= sc.nextInt();
        primes(n);
        int[] ar = {3,45};
        StringBuilder s = new StringBuilder();

        s.append(ar[0]);
        s.append(ar[1]);
        System.out.println(s);
        s.deleteCharAt(s.length()-1);
        System.out.println(s);

    }

    private static void primes(int n) {
        if(n<=1) System.out.println("invalid range");
        for(int j=2; j<=n; j++) {
            int flag=0;
            for (int i = 2 ; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag != 1) System.out.println(j);
        }
    }
}
