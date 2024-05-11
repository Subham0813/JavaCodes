package OOPSinJAVA.Encapsulation;
class Computer{

    public Computer() {
        System.out.println("You're in Computer Class");
    }
}
class Laptop extends Computer{
    private String company;
    private double price;
    public Laptop(){
        this("Xiaomi");
        System.out.println("Zero Parameterized");
        company = "hp";
        price = 27523.06;
    }
    public Laptop(String company) {
        super();
        System.out.println("Single Parameterized");
        this.company = company;
        price = 26480.00;
    }
    public Laptop(String company, double price) {
        this();
        System.out.println("Setting data");
        this.company = company;
        this.price = price;
    }

    void show(){
        System.out.println(company);
        System.out.println(price);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Laptop com1 = new Laptop();
        com1.show();
        Laptop com2 = new Laptop("lenovo");
        com2.show();
        Laptop com3 = new Laptop("Asus",89550);
        com3.show();
        Laptop com4 = new Laptop();
        com4.show();

    }
}
