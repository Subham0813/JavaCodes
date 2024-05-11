package ConditionalStatement;
import java.util.*;
public class ex3_SameUpto3Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter Two numbers : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        num1 = Math.round(num1*1000);
        num1 = num1/1000;
        num2 = Math.round(num2*1000);
        num2 = num2/1000;
        if (num1 == num2) System.out.println("They are same upto three decimal point");
        else {
            System.out.println("the are different");
        }
    }
}
