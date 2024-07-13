package DataStructures.strings;

import java.util.ArrayList;
import java.util.List;

public class substring {
    public static void main(String[] args) {
//        String s = "Physics";
//        for (int i =2; i<=4; i++){
//            System.out.println(s.substring(i));
//        }
        String str = "abcd";
        System.out.println(str.substring(0,1));
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");   //subString ( firstIndex, LastIndex-1)
            }
        }
        List<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.remove("a");
        System.out.println(list);


    }



}
