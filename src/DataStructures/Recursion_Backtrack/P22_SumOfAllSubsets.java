package DataStructures.Recursion_Backtrack;

public class P22_SumOfAllSubsets {
    public static void main(String[] args) {
        int[] arr = {2,7,5};
        subsetSum(arr,0,0);
        System.out.println();
        //for sorted order
        int sum =0;
        for (int i: arr){
            sum+=i;
        }
        subsetSumAlternative(arr,sum,arr.length-1);
    }

    static void subsetSum(int[] arr, int currSubSum, int id){

        //base case
        if(id == arr.length) {
            System.out.print(currSubSum+" ");
            return;
        }

        //curr sum
        subsetSum(arr,currSubSum,id+1);
        //curr sum + arr[id]
        subsetSum(arr,(currSubSum + arr[id]),id+1);
    }

static void subsetSumAlternative(int[] arr, int currSubSum, int id){

    //base case
    if(id < 0) {
        System.out.print(currSubSum+" ");
        return;
    }

    //curr sum + arr[id]
    subsetSumAlternative(arr,(currSubSum - arr[id]),id-1);
    //curr sum
    subsetSumAlternative(arr,currSubSum,id-1);

}
}
