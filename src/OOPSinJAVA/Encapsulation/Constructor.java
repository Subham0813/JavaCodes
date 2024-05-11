package OOPSinJAVA.Encapsulation;

class Data {
    private String name;  //DataHiding
    private double balance; //DataHiding

    Data (String name, double balance) {  //Constructor
        this.name = name;
        this.balance = balance;
    }

//    void setData(){            //THIS IS NOT NEEDED
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
public class Constructor {
    public static void main(String[] args) {
        Data customer1 = new Data("Subham Bachar",1412.98);
        customer1.getData();
        System.out.println(customer1.getName());
        System.out.println(customer1.getBalance());
    }
}
