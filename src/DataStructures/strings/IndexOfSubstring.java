package DataStructures.strings;

public class IndexOfSubstring {
    public static void main(String[] args) {
        String str = "String Program";
        String subStr = "rigP";
//        if(str.indexOf(subStr) == -1){
//            System.out.println("Not Present");
//        } else {
//            System.out.println("Present at Index "+ str.indexOf(subStr.charAt(0))
//                    + " " + "to " + str.indexOf(subStr.charAt(subStr.length()-1)));
//        }
        System.out.println(str.contains(subStr));

    }
}
