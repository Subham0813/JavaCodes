package DataStructures.Recursion_Backtrack;

public class p5_1_CountOfD1gits {

    public static void main(String[] args) {
        System.out.println(countDigits(-148926));
    }

    private static int countDigits(int n) {
        //base
        if(n<0) n= n*(-1);
        if(n>=0 && n<=9)return 1;
        //self
        return countDigits(n/10)+1;
    }

}