package OOPSinJAVA.Polymorphism;

class Some{
    static int a =10;
    private int b =20; //can't access without a getter method outside THIS class

    public int getB() { //method to access b value (dataHiding Concept)
        b = 100;
        return b;
    }

    static void m1(){
        System.out.println("A Static Method"); //can access from any package, any class within entire project.

    }
    static {
        System.out.println("Static Block");     //Static Block always executes first before main method execution
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Some s = new Some();
        Some.a = 20;
        System.out.println(Some.a);
        s.m1();
        int c = s.getB();
        System.out.println(c);

    }
}
