package DataStructures.Searching;

public class SearchInRotatedSortedArrayII_81LeetCode {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,2};
        System.out.println(findPivot(arr,0,arr.length-1));
//        System.out.println(arr[findPeak(arr)]);
    }
    static  int findPeak(int[] nums){
        int start=0, end= nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]) return mid;
            if(mid>0 && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid] == nums[start] || nums[mid] == nums[end]) {
                if (start < nums.length - 1 && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > 0 && nums[end] < nums[end - 1]) {
                    return end-1;
                }
                end--;
            }
            else if(nums[mid]>nums[start]) start=mid+1;
            else end=mid;

        }
        return -1;
    }
    static int findPivot(int[] nums,int start, int end){
        if(start>=end || end<=start) return -1;

        int mid = start + (end-start)/2;
        if(nums[mid]>nums[mid+1]) return mid;
        if(nums[mid]<nums[mid-1]) return mid-1;

        if(nums[mid]>nums[start]) return findPivot(nums,mid+1,end);
        else return findPivot(nums,start,mid);

    }
}
