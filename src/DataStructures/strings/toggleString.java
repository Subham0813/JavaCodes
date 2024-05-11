package DataStructures.strings;
import java.util.*;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());
        for(int i = 0; i< str.length() ;i++){
            int asc = str.charAt(i);
//            System.out.println(asc);
            if (asc >=97 && asc<=122 ){
                asc -= 32;
                char s = (char)asc;
                str.setCharAt(i,s);
            } else if (asc >= 65 && asc <= 90) {
                asc += 32;
                char s = (char)asc;
                str.setCharAt(i,s);
            }
            else str.charAt(i);
        }
        System.out.println(str);

    }
}





