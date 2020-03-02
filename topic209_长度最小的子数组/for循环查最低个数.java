class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int allsum = 0;
        for(int j=0;j<nums.length;j++){
            allsum+=nums[j];
        }
        if(allsum<s){
            return 0;
        }
        int  end = nums.length-1;
        int start = 0;
        int smallnum = Integer.MAX_VALUE;
        while(start<=end){
            int sum = 0;
            int num = Integer.MAX_VALUE;
            for(int i=start;i<=end;i++){
                sum+=nums[i];
                if(sum>=s){
                    num = i-start+1;
                    break;
                }
            }
            smallnum = smallnum>num?num:smallnum;
            start++;
        }
        return smallnum;
    }
}