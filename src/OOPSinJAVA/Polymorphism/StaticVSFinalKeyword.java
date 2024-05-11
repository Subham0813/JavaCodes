package OOPSinJAVA.Polymorphism;

class Keywords{
    static int a = 20;
    final int b = 30;
    static {
        System.out.println("static block"); //execute before main method
    }
    // final{ //
        //
    //}
    static void m1(){
        System.out.println("static method");
        //b = 50;
        // final variables cant be modified and acts as compile-time constants ,
        // if we try to modify it will give "can not assign a value to a final variable"
    }
    public final void m2 (){
        System.out.println("final method"+" "+ b);
        a = 30;
    }
}
class Key extends Keywords{
    //final method can't be modified ,if we do so, it will give error "overridden method is final"
    /*  public final void m2(){
        System.out.println("overriding");
        a =50;
        } */
}
public class StaticVSFinalKeyword {
    public static void main(String[] args) {
        Keywords k = new Keywords();
        System.out.println(k.a);
        k.m2();
        System.out.println(k.a);
    }
}
