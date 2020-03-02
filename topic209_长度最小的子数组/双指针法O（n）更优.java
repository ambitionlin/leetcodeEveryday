class Solution {
    public int minSubArrayLen(int s, int[] nums) {
       if(nums==null||nums.length==0){
           return 0;
       }
        int i=0, j = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j++];
            if(sum<s){
                continue;
            }
            while(sum>=s){
                sum-=nums[i];
                i++;
            }
            minLen = Math.min(minLen,j-i+1);
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}