package DataStructures.strings;

import java.util.Scanner;
public class CheckPalindrome {
    public static boolean isPalindrome(String s){
        int l = 0 , r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static boolean isPalin(String s) {
        StringBuilder ss = new StringBuilder();
        //making
        for(char c : s.toCharArray()){
            if(c>='A' && c<='Z'){
                ss.append((char)(c+' '));
            }else if(c>='a' && c<='z'){
                ss.append(c);
            }else if(c>='0' && c<='9'){
                ss.append(c);
            }
        }
        //checking
        int l=0, r=ss.length()-1;
        while(l<r){
            if(ss.charAt(l) != ss.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String str= sc.nextLine();
//        System.out.println(isPalindrome(str));
        System.out.println(isPalin("0P"));

    }
}
