package OOPSinJAVA.Exception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println(2/0);
            int[] a = {};
            System.out.println(a[10]);
            String s = "";
            System.out.println(s.charAt(1));
            s = null;
            System.out.println(s.length());
        }
//        catch (ArithmeticException ae){
//            System.out.println("arithmetic");
//            ae.printStackTrace();
//        } catch(ArrayIndexOutOfBoundsException a){
//            System.out.println("ArrayIndexOutOfBound");
//            a.printStackTrace();
//        } catch (NullPointerException n){
//            System.out.println("NullPointer");
//            System.out.println(n.getMessage());
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ae){   //--> No Parent Child relation will be entertained
            System.out.println(ae.getMessage());
        } catch(Exception e){                  //-->  Exception Class Always after the Child Exception classes Otherwise CE
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
