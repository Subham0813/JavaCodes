package DataStructures.Sorting.Problems;

public class sortZeroesWithoutBreakingOrder {
    void sortZero(int[] a){
        for(int i=0; i<a.length; i++){
            boolean check = false;
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]==0 && a[j+1] != 0){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    check = true;
                }
            }
            if(!check){
                return;
            }
        }
    }
    void display(int[] a){
        for (int ele: a) {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,5,6,7,20,0,2,33,4,0,12,22};
        sortZeroesWithoutBreakingOrder a = new sortZeroesWithoutBreakingOrder();
        a.sortZero(arr);
        a.display(arr);
    }
}
