package Others;

import java.util.*;

public class example {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = new String[10];
        StringBuilder sb = new StringBuilder("");
        int id=0;
        for(int i =0; i<s.length(); i++){
            if(!(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9) && s.charAt(i) != ' ') sb.append(s.charAt(i));
            else if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9) {
                String str =  sb.toString();
                arr[s.charAt(i)-'0'] = str;
                sb = new StringBuilder("");
            }
        }
        for(String ss : arr){
            if(ss != null) sb.append(ss +" ");
        }


        System.out.println(' '-'0');
        System.out.println('A'-'0');

        String[] sentences = s.split(" ");
        int i=0;
        while(i<sentences.length){
            sb = new StringBuilder(sentences[i]);
            int index = sb.charAt(sb.length()-1)-'0';
            if(index-1 != i && index<= sentences.length){
                sb = sb.deleteCharAt(sb.length()-1);
                sentences[i]=sentences[index-1];
                sentences[index-1]=sb.toString();
            } else if( index-1 == i ){
                sentences[i] = sb.deleteCharAt(sb.length()-1).toString();
                i++;
            } else i++;
        }
        sb=new StringBuilder();
        for(i=0; i<sentences.length; i++){
            sb.append(sentences[i]);
            if(i != sentences.length-1) sb.append(" ");
        }
    }
}
