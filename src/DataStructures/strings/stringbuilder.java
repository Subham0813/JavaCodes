package DataStructures.strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" world");
//        System.out.println(str);
        str.append(10);         //hello world10
        str.setCharAt(5,'a');   //helloaworld10
        str.insert(4,"1342");   //hell1342oaworld10
        str.deleteCharAt(4);        //hell342oaworld10
        str.delete(2,6);
        //delete the string from 2nd index to 6th index
        // hell342oaworld10  -->  he2oaworld10

        System.out.println(str);




    }
}
