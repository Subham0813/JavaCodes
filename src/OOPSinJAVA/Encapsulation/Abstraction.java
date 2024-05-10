package OOPSinJAVA.Encapsulation;

abstract class xComputer{                       //not 100% Abstraction
    public abstract void runCode();
    public abstract void Execution();
    public void m1(){
        System.out.println("You're in xComputer class");
    }

}
class xDesktop extends xComputer {
    @Override
    public void runCode() {
        System.out.println("Running Code in Desktop");
    }
    @Override
    public void Execution() {
        System.out.println("Executing Code in Desktop");
    }
}
class xLaptop extends xComputer{
    @Override
    public void runCode() {
        System.out.println("Running Code in Laptop");
    }
    @Override
    public void Execution() {
        System.out.println("Executing Code in Laptop");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        xComputer p1 = new xLaptop();

        p1.runCode();
        p1.Execution();
        p1.m1();

        xComputer p2 = new xDesktop();

        p2.runCode();
        p2.Execution();
        p2.m1();

        xComputer p3 = new xComputer() {
            @Override
            public void runCode() {
                System.out.println("Anonymous Class");
                System.out.println("overriding abstract method runCode");
            }

            @Override
            public void Execution() {
                System.out.println("Anonymous Class");
                System.out.println("overriding abstract method Execution");
            }

        };

        p3.runCode();
        p3.Execution();




    }
}
