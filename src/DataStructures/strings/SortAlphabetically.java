package DataStructures.strings;

import java.util.Arrays;

public class SortAlphabetically {
    public static void main(String[] args) {
        String s = "SSubham";
        char[] arr = s.toCharArray();
//        StringBuilder ans = new StringBuilder("");
        Arrays.sort(arr);
//        for(char c : arr){
//            ans.append(c);
//        }
//        System.out.println(ans);
        System.out.println(String.valueOf(arr));
    }
}
