package DataStructures.strings;

import java.util.Scanner;

public class ChangeCase {
    public static String invertCase(String str){
       String s2 = "";
       for(int i =0; i<str.length(); i++){
           if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                s2 += (char)(str.charAt(i)+' ');   //' ' == 32 ascii
            } else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
               s2 += (char)(str.charAt(i)-' ');
            } else s2 += str.charAt(i);
       }
        return s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.nextLine());
        System.out.println(invertCase(str));
    }
}

//    public static String invertCase(String str){
//        char[] s = str.toCharArray();
//        for (int i =0; i<s.length; i++){
//            if(s[i]>=65 && s[i]<=90){
//                s[i] += 32;
//            } else if(str.charAt(i)>=97 && str.charAt(i)<=122){
//                s[i] -= 32;
//            } else return "Invalid String";
//        }
//        //creating string
//        String ans = "";
//        for (char c :s) {
//            ans += String.valueOf(c);
//        }
//        return ans;
//
//    }