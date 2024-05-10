package OOPSinJAVA.Inheritance;

interface One{
    void m1();
}
interface Two{
    void m2();
}
interface Zero extends One, Two {
    int m3 ();
}
class Three implements One, Two{
    public void m1() { }
    public void m2 () { }
}
class Four extends Three implements Zero{
    public int m3() {return 0;}
    Four() {
        System.out.println("Hello");
    }
}

public class Inheritance_Multiple {
    public static void main(String[] args) {

//         ** THIS IS AN EXAMPLE OF MULTIPLE INHERITANCE  **
    }
}
