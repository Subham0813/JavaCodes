package OOPSinJAVA.Polymorphism;

class Test{
    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public long sum(long a, long b){
        long sum = a+b;
        return sum;
    }
    public float sum(float a, float b){
        float sum = a+b;
        return sum;
    }
    public double sum(double a, double b){
        double sum = a+b;
        return sum;
    }
}

public class Polymorphism_MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum(9,6));
        System.out.println(t.sum(900000000L, 300000000L));
        System.out.println(t.sum(3.50f,9.77f));
        System.out.println(t.sum(4.07d,5d));
    }
}
