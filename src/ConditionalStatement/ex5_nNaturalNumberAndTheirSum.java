package ConditionalStatement;
import java.util.*;
public class ex5_nNaturalNumberAndTheirSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.printf("\nsum of %d natural number is : %d",n,sum);
        double avg = (double) sum/n;
        System.out.println("\nThe Avarage is : "+avg);

        for (int j=1; j<=n; j++){
            int cube = j*j*j;
            System.out.printf("number is : %d and cube of %d is : %d\n",j,j,cube);
        }
    }
}
