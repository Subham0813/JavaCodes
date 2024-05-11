package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class P17_reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss= in.nextLine();
        System.out.println(reverse(ss));

    }

    static String reverse(String s){
        if(s.isEmpty()) return "";

        return reverse(s.substring(1))+ s.charAt(0);
    }
}
