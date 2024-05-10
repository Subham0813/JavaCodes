package ConditionalStatement.StarPatterns;
import java.util.*;
public class ex3_UpSideDownRightangleTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of column : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<i; k++){
                System.out.print(" ");
            }
            for (int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
