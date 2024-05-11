package OOPSinJAVA.Polymorphism;

class Demo{
    void displayMessage(){
        System.out.println("Hello. This is Demo class.");
    }

}

public class Polymorphism_MethodCalling {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.displayMessage();
    }

}
