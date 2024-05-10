package Others;

import java.util.*;

public class firstJavaProgram {
    public static void main(String[] args) {
        int[] nums= {-5,-3,-2,-1};
//        int max =0;
//        for(int a=0; a<nums.length-2; a++){
//            int b = a+1 , c = nums.length-1;
//            while(b<c){
//
//                if(nums[a]+nums[b] < nums[c] || nums[b]+nums[c] < nums[a] || nums[c]+nums[a] < nums[b]) c--;
//                else if(nums[a]+nums[b] > nums[c] && nums[b]+nums[c] > nums[a] &&  nums[c]+nums[a] > nums[b]){
//                    int sum = nums[a]+nums[b]+nums[c];
//                    if(sum >= max) max = sum;
//                    b++;
//                } else c--;
//            }
//        }
//        System.out.println(max);
//        int i=0, j=nums.length-1, zero=0;
//        while(i<=j){
//            if(nums[j] == 0){
//                int temp = nums[zero];
//                nums[zero++] = nums[j];
//                nums[j] = temp;
//                i++;
//            }else{
//                int lSq=nums[i]*nums[i];
//                int rSq=nums[j]*nums[j];
//                if(lSq>rSq){
//                    int temp = nums[j];
//                    nums[j] = lSq;
//                    nums[i] = temp;
//                }else if(lSq<rSq){
////                    int temp = nums[j];
//                    nums[j] = rSq;
////                    nums[i] = temp;
//                } else nums[j] = rSq;
//                j--;
//            }
//            if(i==j) {
//                nums[j]*= nums[j];
//                j--;
//            }
//        }
//        System.out.println(Arrays.toString(nums));

        int[] arr = {1,2,4,8,16,32,64,128,256,512,1024};
        int[] count = new int[arr.length];
        int max = 0;
        for(int i=0; i<arr.length; i++){
            int n = arr[i], c = 0;
            while(n>0){
                if((n & 1) == 1) c++;
                n>>=1;
            }
            count[i] = c;
            if (c > max) max = c;
        }
        int[] ans = new int[arr.length];
        int j = arr.length-1;
        while(max>=0){
            for(int i=arr.length-1; i>=0; i--){
                if(count[i] == max) ans[j--] = arr[i];
            }
            max--;
        }
        System.out.println(Arrays.toString(ans));
















    }
}

