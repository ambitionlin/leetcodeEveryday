class Solution {
    public int pivotIndex(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            int leftsum = 0;
            int rightsum = 0;
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            for(int j=i+1;j<n;j++){
                rightsum+=nums[j];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
}