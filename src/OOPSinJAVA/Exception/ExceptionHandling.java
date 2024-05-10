package OOPSinJAVA.Exception;

class Ex{
    private int a = 0;
    private int b = 0;

    public void setA(int a) { this.a = a;}
    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    void disp (){
        try {
            System.out.println(a / b);    //Risky code
        } catch (ArithmeticException e){
            e.printStackTrace();
            //java.lang.ArithmeticException: / by zero
            //	at OOPSinJAVA.Exception.Ex.disp(ExceptionHandling.java:25)
            //	at OOPSinJAVA.Exception.ExceptionHandling.main(ExceptionHandling.java:39)

            System.out.println(e.getMessage()); // /by Zero
            System.out.println(e); //java.lang.ArithmeticException: / by zero
        }

    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        Ex x = new Ex() ;
        x.setA(2);
        x.setB(0);
        x.disp();
    }
}
