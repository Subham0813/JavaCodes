package DataStructures.strings;

public class reverseEachWordString {
    public static void main(String[] args){
       String s = "Think Twice Always";
       StringBuilder rev = new StringBuilder("");
       StringBuilder str = new StringBuilder("");
       for(int i = 0; i< s.length(); i++){
           if (s.charAt(i) != ' ') {
               str = str.append(s.charAt(i));
           }
           else {
               str.reverse();
               rev = rev.append(str + " ");
               str = new StringBuilder("");
           }
       }
       str = str.reverse();
       rev =rev.append(str);
       System.out.println(rev);
    }

}
