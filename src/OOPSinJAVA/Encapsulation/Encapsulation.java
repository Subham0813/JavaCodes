package OOPSinJAVA.Encapsulation;
class Account {
    private String name;  //DataHiding
    private double balance; //DataHiding
//    void setData(){
//        name = "No Name";
//        balance = 1.00;
//    }
    void getData(){
        System.out.println(name);
        System.out.println(balance);
    }
    public String getName() {               //setter
        return name;
    }
    public void setName(String name) {      //getter
        this.name = name;
    }
    public void setBalance(double balance) {    //setter
        this.balance = balance;
    }
    public double getBalance() {               // getter
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Account customer1 = new Account();
//        customer1.setData();
        customer1.getData();
        customer1.setName("Subham Bachar");
        customer1.setBalance(25341.04);
        customer1.getData();


    }
}
