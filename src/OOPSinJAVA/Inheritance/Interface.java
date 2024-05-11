package OOPSinJAVA.Inheritance;
interface inter{

    //an interface is an absolute pure abstraction (dataHiding + Encapsulation)

    int x = 20; //only declaration of variable will give compileTime Error, must need to initialize variable.
    // private int y = 30; //CE ** because all variables inside an interface is by default --> public static final **
    public static final int y = 90; //by default, it is so IDE ignoring that part

    // static { ;;;;;;; } //static block not allowed in Interface
    abstract public void m1 (); //by default, all method inside an Interface is public abstract..
    void m2();
}
class TestInter implements inter{
    //whenever we're implementing an interface method it should be always public
    //otherwise it will give CompileTime-Error
    public void m1(){
        System.out.println("method 1 from Interface");
    }
    public void m2(){
        System.out.println("method 2 from Interface");
    }
    // x = 70; // **CE ---> final variable can't be modified
}

public class Interface {
    public static void main(String[] args) {
        TestInter ti = new TestInter();
        ti.m1();
        ti.m2();
        System.out.println(ti.x);
        System.out.println(ti.y);

    }
}
