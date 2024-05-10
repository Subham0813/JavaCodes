package DataStructures.strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Subham Bachar";
        char c = 'a';
        StringBuilder s = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != c){
                s.append(str.charAt(i));
            } else continue;
        }
        System.out.println(s);
    }
}
