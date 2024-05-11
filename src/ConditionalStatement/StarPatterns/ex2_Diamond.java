package ConditionalStatement.StarPatterns;
import java.util.*;
public class ex2_Diamond {
    public static void main(String[] args) {
        System.out.println("enter no of column :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = n, ml= n/2;

        for (int i=1; i<=n; i++){
            for (int k= 1; k<nsp; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<= nst; j++){
                System.out.print("*");
            }
            if (i<=ml) {
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}
