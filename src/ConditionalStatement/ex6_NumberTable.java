package ConditionalStatement;
import java.util.*;
public class ex6_NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        for (int i=1; i<=10; i++){
           int mul = i*num;
            System.out.printf("%d X %d = %d\n",num,i,mul);
        }
        System.out.println("");
        for(int k=0; k<=num; k++){
            int x = k*num;
            System.out.printf("%d X %d = %d\n",num,k,x);
        }
    }
}
