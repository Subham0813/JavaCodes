package OOPSinJAVA.Exception;

class MyException extends Exception{
    private int a;
    MyException(int a){
        this.a = a;
    }
    MyException(String msg){
        super(msg);
    }
    public String toString(){
        return "MyException [ " + a + " ]";
    }

}
public class CustomizedException {

    static void methodOne(int a) throws MyException{
        System.out.println("compute (" + a + ")");
        if(a>10) throw new MyException(a);
        System.out.println("Normal Execution");
    }

    public static void main(String[] args) {
      int a =20;
      int b = 2;
      try{
          if(b<0) throw new MyException("Negative not allowed");
          if(b==0) throw new MyException("Zero not Allowed in b");
          else System.out.println(a/b);
      } catch(MyException mx){
          System.out.println(mx.getMessage());
      }

      try{
          methodOne(20);

          for(int i=0; i<=10; i++) {
              System.out.print(i + " ");
              Thread.sleep(500);//CheckedException to be handled by Coder otherwise ERROR : unreported exception
                                        // java.lang.InterruptedException; must be caught or declared to be thrown
          }
          System.out.println();
          methodOne(a);

      }catch (MyException | InterruptedException mx){
          System.out.println("Caught Exception : " + mx);
      } finally {
          System.out.println("Finally Executed");
      }

    }
}
