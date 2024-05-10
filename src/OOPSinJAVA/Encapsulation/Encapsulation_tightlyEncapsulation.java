package OOPSinJAVA.Encapsulation;

class A {
    private int x = 1; //tightly encapsulated
}

class B extends A{
   int y =2; //extends class A but variable is not Private so, NOt Tightly encapsulated
}
class C extends B{
  private double z = 3.0; // extends not tightly encapsulated class so, whether it's variable
}                         // private or not doesn't get checked it will act as not Tightly encapsulated
class D extends A{
    private boolean W = false; //extends Tightly encapsulated class and also contains private variable, so Valid.
}
public class Encapsulation_tightlyEncapsulation {
    public static void main(String[] args) {
        D d = new D();

    }
}
