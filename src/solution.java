class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd =0, even=0;
        for(int i=0; i<position.length; i++){
            if(position[i]%2 == 0){ even++; }
            else { odd++; }
        }
        int result = findMin(even,odd);
        return result;
    }

    private int findMin(int even, int odd){
        if(even > odd) return odd;
        if(even < odd) return even;
        return even;
    }
}