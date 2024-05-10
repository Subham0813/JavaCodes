package ConditionalStatement.StarPatterns;
import java.util.*;
public class ex1_rightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

        /*  THIS WILL PRINT
            1
            1 2
            1 2 3
            1 2 3 4
        for (int i = 0; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" "+j+" ");
            }
            System.out.print("\n");
        }  */


        /*  THIS WILL PRINT
                1
                2 2
                3 3 3
                4 4 4 4
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" "+i+" ");
            }
            System.out.print("\n");
        }   */

        /* THIS WILL PRINT
                1
                2 3
                4 5 6
                7 8 9 10   THIS IS CALLED FLOYD'S TRIANGLE

        int pos = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" "+pos+" ");
                pos +=1;
            }
            System.out.print("\n");
        } */

        /* THIS WILL PRINT
                1
               2 2
              3 3 3
             4 4 4 4
        NUMBER TRIANGLE OR STAR TRIANGLE
*/
        for (int i = 1; i<=n; i++){
            for (int k=n; k>i-1; k--){      //for spaces
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }




    }
}
