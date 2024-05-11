package DataStructures.Recursion_Backtrack;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr ={1,3,1,3,5,6,4,8,9};
        System.out.println(findWaysFor(arr,0,8, 0));
    }

    static int findWaysFor(int[] arr, int id, int target, int currSum) {

        if(id == arr.length){
            if(target == currSum){
                return 1;
            }else return 0;
        }

        //include one explore for next
        int t1 = findWaysFor(arr,id+1,target,currSum + arr[id] );
        //exclude one explore for the next
        int t2 = findWaysFor(arr,id+1, target,currSum -arr[id]);
        return t1 + t2;
    }
}
