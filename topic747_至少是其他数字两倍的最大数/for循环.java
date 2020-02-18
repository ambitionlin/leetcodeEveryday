class Solution {
    public int dominantIndex(int[] nums) {
        int maxindex = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[maxindex]<nums[i]){
                maxindex = i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=maxindex&& nums[maxindex]<nums[i]*2){
                return -1;
            }
        }
        return maxindex;
    }
}