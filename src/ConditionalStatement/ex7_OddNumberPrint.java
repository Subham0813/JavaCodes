package ConditionalStatement;
import java.util.*;
public class ex7_OddNumberPrint {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a NUMBER : ");
        int num = Sc.nextInt();
        int odd = 1, sum = 0;
        for (int i=0; i<num; i++){
            if (odd%2 != 0){
                System.out.println(odd);
                sum += odd;
                odd+=2;
            }
        }
        System.out.printf("The sum of Odd natural number upto %d term is : %d\n",num,sum);
    }
}
