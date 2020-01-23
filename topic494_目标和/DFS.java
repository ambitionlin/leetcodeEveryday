class Solution {
    public int findTargetSumWays(int[] nums, int S) {
       return findTargetSumWays(nums,0,S);
    }
    public int findTargetSumWays(int[] nums, int start, int S){
        if(start==nums.length){
            return S==0?1:0;
        }
        return findTargetSumWays(nums,start+1,S+nums[start])+findTargetSumWays(nums,start+1,S-nums[start]);
    }
}
//复杂度分析
//时间复杂度：O(2^N),其中 NN 是数组 nums 的长度。
//空间复杂度：O(N),为递归使用的栈空间大小。