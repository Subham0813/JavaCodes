package OOPSinJAVA.Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        /*
        try{
            System.out.println(arr[9]); //no compileTime error(checked Exception) ,
                                            // it is Runtime exception(Unchecked Exception)
        }catch(NullPointerException ne){
            System.out.println(ne);
        }                           // <---- jvm shuts down at this point
        System.out.println("hello");//not executing
        */
        try{
            System.out.println(arr[6]); //no compileTime error(checked Exception) ,
                                        // it is Runtime exception(Unchecked Exception)
        }catch(ArrayIndexOutOfBoundsException ae){
//            System.out.println("wrong Index");
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("Hello");
        }

    }
}
