package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class P19_palindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String ss = in.nextLine();
//        System.out.println(isPalindrome(ss)); //without reversing
//
//        System.out.println(isPalindromePointer(ss,0,ss.length()-1));
//
//        String rev = isPalindromeWithReverse(ss);
//        if(rev.equals(ss)){
//            System.out.printf("%s is palindrome",ss);
//        } else {
//            System.out.printf("%s is not palindrome",ss);
//        }

        int a = in.nextInt();
        String g = String.valueOf(a);

        System.out.println(isPalindrome(g));


    }

    static boolean isPalindrome(String s){

        if (s.length() == 0) return true;

        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        if(s.length() > 1){
            return isPalindrome(s.substring(1,s.length()-1));
        } else {
            return true;
        }

    }
    static String isPalindromeWithReverse(String s){
        if(s.length() == 0) return "";

        return isPalindromeWithReverse(s.substring(1))+ s.charAt(0);
    }

    static boolean isPalindromePointer( String s, int l, int r ){
        if(l >= r) return true;

        return (s.charAt(l) == s.charAt(r) && isPalindromePointer(s,l+1,r-1)) ;
    }

}
