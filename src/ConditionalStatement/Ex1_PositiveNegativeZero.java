package ConditionalStatement;
import java.util.*;

public class Ex1_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        float num1 = Sc.nextFloat();
        if (num1== 0) System.out.println("zero");
        else if (num1>0) {
            System.out.println("positive");
            num1 = Math.abs(num1);
            if (num1 < 1) System.out.println("small " + num1);
            if (num1 > 1000000) System.out.println("large "+num1);
        }
        else System.out.println("negetive");


    }
}
