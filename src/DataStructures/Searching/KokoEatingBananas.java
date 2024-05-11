package DataStructures.Searching;

class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(arr,1000000000));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        //Koko can decide her #bananas-per-hour# eating speed of k.
        //k = banana/h;
        //banana = piles[i]
        int start =1;
        int end = findMax(piles);
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(totalHours(piles,mid,h)) {
                ans = mid;
                end=mid-1;
            } else start = mid+1;
        }
        return ans;
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>max) max =i;
        }
        return max;
    }
    static boolean totalHours(int[] piles, int speed,int h){
        long total = 0;
        for(int pile : piles){
//             total += Math.ceil( (double) pile / (double) speed );
            total += (long)pile/(long)speed;
            if(pile%speed != 0) total+=1;
        }
        return total<=h;
    }
}