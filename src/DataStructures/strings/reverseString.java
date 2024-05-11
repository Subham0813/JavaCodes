package DataStructures.strings;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder st = new StringBuilder(sc.nextLine());
        String s = reverseString("Subham");
        System.out.println(s);

        //reverse a string using loop
        //subham
//        for (int i= st.length()-1; i>=0; i--){
//            System.out.print( st.charAt(i));
//        }
    }
    public static String reverseString(String s){
        char[] c = s.toCharArray();
        int st=0,en=c.length-1;
        while(st<en){
            char temp = c[st];
            c[st++]=c[en];
            c[en--]=temp;
        }
        s="";
        for(char aa : c) s += aa;     //  += operator concat char and string but .concat() method
                                      //  concat only String
        return s;
    }
}
