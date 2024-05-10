package ConditionalStatement.StarPatterns;
import java.util.*;
public class ex4_Diamond_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the largest digit of the diamond: ");
        int n = sc.nextInt();
        int nsp= n,nst= 1;
        for (int i=1; i<=n*2; i++){
                for (int k = 1; k <= nsp; k++) {
                    System.out.print("&");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("");
                }
                if (i <= n) {
                    nst += 2;
                    nsp--;
                } else {
                    nst -= 2;
                    nsp++;
                }
                System.out.println();
        }
    }
}
