package ConditionalStatement;
import java.util.*;

public class ex4_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year to check :");
        int Y = sc.nextInt();
        boolean isLeap = false;
        if(Y%4 == 0 && Y%100 == 0 && Y%400 == 0) {
            isLeap = true;
        }
        else if (Y%4 == 0 && Y%100 != 0) {
            isLeap = true;
        }
        else {
            isLeap = false;
        }

        if (isLeap == true){
            System.out.println("It is a Leap Year");
        }
        else System.out.println("Not a Leap Year.");


    }
}
