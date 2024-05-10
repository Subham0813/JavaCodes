package DataStructures.strings;

public class LeetcodeMedium {
    public static void main(String[] args) {
       String str = "AAAABBCCC";
        char ch ;
        int index1 = 0, count = 0;
       StringBuilder sb = new StringBuilder();

       for(int i=0; i < str.length(); i++){

           ch = str.charAt(i);
           int index2 = str.indexOf(ch);

           if (index1 == index2){
               count+= 1;
           }
           else {
               if (count>1) {
                   sb = sb.append(str.charAt(index1));
                   sb = sb.append(count);
                   count = 1;
               }
               else {
                   sb = sb.append(str.charAt(index1));
               }
           }
           index1 = index2;
       }
        char ch2 = str.charAt(str.length()-1);
        sb = sb.append(ch2);
        sb = sb.append(count);
        System.out.println(sb);
    }

}

