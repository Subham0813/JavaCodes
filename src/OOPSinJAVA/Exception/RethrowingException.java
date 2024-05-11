package OOPSinJAVA.Exception;

public class RethrowingException {
    public static void main(String[] args) {
        String s = "";
        try{
            System.out.println(s.charAt(10));
        } catch (IndexOutOfBoundsException e){
            throw new NullPointerException(e.getMessage());
        }
    }
}
