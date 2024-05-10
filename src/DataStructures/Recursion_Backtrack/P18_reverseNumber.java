package DataStructures.Recursion_Backtrack;

public class P18_reverseNumber {
    public static void main(String[] args) {
        int num = -18630001;
//        System.out.println(reverse(num));
//        System.out.println(rev(num));
        System.out.println(num);
        System.out.println(reverseNum(num));
    }
    static int reverse(int n){
        if (n>=0 && n<=9) return n;
        int result = 0;
        int myNum = n;
        while(myNum > 0){
            result = result*10 + myNum%10;
            myNum /= 10;
        }
        return result;
    }
    static int rev(int x) {
        int result = 0;
        int myInt = x;
        if (x < 0) myInt = x * (-1);

        while (myInt > 0) {
            result = result * 10;
            if (result > Integer.MAX_VALUE) return 0;
            result += myInt % 10;
            myInt /= 10;
        }

        if (x > 0) {
            return result;
        } else return -result;
    }

    static int reverseNum(int n){
        if(n>=0 && n<=9) return n;

        int myNum = n;
        if(myNum<0) n*=(-1);

        int rem= n%10;
        n/=10;
        int c =count(n,1);

        if(myNum<0)return -(rem * c + reverseNum(n));
        else return (rem * c + reverseNum(n));

    }
    static int count(int n, int c){
        while(n>0){
            c*=10;
            n/=10;
        }
        return c;
    }
}
