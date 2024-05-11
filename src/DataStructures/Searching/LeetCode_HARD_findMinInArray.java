package DataStructures.Searching;

class LeetCode_HARD_findMinInArray {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
    // Arrays.sort(nums);
    // return nums[0];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0],nums[1]);

        int pivotIdx = BS(0, nums.length-1, nums);
        int ans1 = nums[BS(0, pivotIdx-1, nums)];
        int ans2 = nums[BS(pivotIdx, nums.length-1, nums)];
        return Math.min(ans1,ans2);
    }

    static int BS(int start, int end, int[] nums){
        // if(start>end) return start;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<nums.length-1 && nums[mid]<=nums[mid+1]) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}