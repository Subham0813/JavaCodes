package OOPSinJAVA.Exception;

class Ex1 {

    void method1() throws ArithmeticException{      //-->Ducking
        method2();
    }
    void method2() throws ArithmeticException{      //-->Ducking
        System.out.println(10/0);
    }

}

public class HandlingVsDucking {
    public static void main(String[] args) {  //--> use Throws keyword here will cause exception Handled by JVM itself with Default exception Handler
        Ex1 e = new Ex1();
        try {                                 //-->Handling
            e.method1();
        } catch (Exception ex){
            System.out.println("Exception Handled");
        }
    }
}
