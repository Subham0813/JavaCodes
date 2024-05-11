package DataStructures.Recursion_Backtrack;

public class P23_FrogProblem {


/*    static int getMinCostEfficient(int[] a, int i){
        if(i>= a.length-1) return 0;
        if(i==a.length-2) return Math.abs(a[i]-a[i+1]);

        int step1 = Math.abs(a[i]-a[i+1]);
        int step2 = Math.abs(a[i]-a[i+2]);

        if(step1 < step2){
            return getMinCostEfficient(a,i+1)+step1;
        }else{
            return getMinCostEfficient(a,i+2)+step2;
        }
   }
*/
static int getMinCost(int[] h, int idx){
    int n = h.length;
    if(idx == n-1) return 0;
    int op1 = getMinCost(h,idx+1) + Math.abs(h[idx] - h[idx+1]);
    if(idx == n-2)  return op1;
    int op2 = getMinCost(h,idx+2) + Math.abs(h[idx] - h[idx+2]);
    return Math.min(op1,op2);
}

    public static void main(String[] args) {
        int[] givenArray = {10,20,10,20,25,10};
        System.out.println(getMinCost(givenArray,0));
    }

}
