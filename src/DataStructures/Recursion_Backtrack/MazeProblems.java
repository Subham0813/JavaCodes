package DataStructures.Recursion_Backtrack;

public class MazeProblems {
    public static void main(String[] args) {
        printWays(3,3,new StringBuilder());
        System.out.println(countWays(3,3));
        printPathFour(0, 0,3, 3,new StringBuilder());
    }

     static void printWays(int r, int c, StringBuilder p) {
        if(r==1 && c==1){
            System.out.print(p.toString() + " ");
        }

        if(r>1) {
            printWays(r - 1, c, p.append("D"));
            p.deleteCharAt(p.length() - 1);
        }
        if(c>1) {
            printWays(r,c-1,p.append("R"));
            p.deleteCharAt(p.length()-1);
        }
    }

    static int countWays(int r,int c){
        if(r==1 && c==1){
            return 1;
        }
        if(r>1) countWays(r-1,c);
        if(c>1) countWays(r,c-1);
        return r+c;
    }
    static void printPathsDiagonal(int r, int c, StringBuilder p){
        if(r==1 && c==1){
            System.out.print(p.toString() + " ");
        }

        if(r>1) {
            printPathsDiagonal(r - 1, c, p.append("V"));
            p.deleteCharAt(p.length() - 1);
        }
        if(r>1 && c>1) {
            printPathsDiagonal(r-1,c-1,p.append("D"));
            p.deleteCharAt(p.length()-1);
        }
        if(c>1) {
            printPathsDiagonal(r,c-1,p.append("H"));
            p.deleteCharAt(p.length()-1);
        }
    }

    static void printPathFour(int r, int c, int m, int n, StringBuilder p){
        if(r==m && c==n){
            System.out.print(p.toString() + " ");
            return;
        }

        if(r>0) {
            printPathFour(r -1, c, m, n, p.append("U"));
            p.deleteCharAt(p.length() - 1);
        }
        if(c>0) {
            printPathFour(r,c-1, m, n, p.append("L"));
            p.deleteCharAt(p.length()-1);
        }
        if(c<n) {
            printPathFour(r,c+1, m, n, p.append("R"));
            p.deleteCharAt(p.length()-1);
        }
        if(r<m) {
            printPathFour(r+1,c,m, n, p.append("D"));
            p.deleteCharAt(p.length()-1);
        }
    }
}
