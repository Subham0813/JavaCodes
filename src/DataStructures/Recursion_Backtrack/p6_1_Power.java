package DataStructures.Recursion_Backtrack;

public class p6_1_Power {
    public static void main(String[] args) {
        System.out.println(powII(2,1111111));
    }

    private static int pow(int p, int q) {
        int c= q;
        if(q==0) return 1;
        if(q<0) q=q*(-1);
        int res = pow(p,q-1) * p;

        if(c<0) return 1/res;
        else return res;
    }

    static double powII(int n, int p){
        if(p==0) return n;
        double res = powII(n , p/2);

        if(p%2==0) return res *res;
        else return n * res * res;
    }

}
