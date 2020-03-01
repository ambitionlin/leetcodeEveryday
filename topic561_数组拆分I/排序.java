import java.util.Arrays;
public class Solution {
    public int arrayPairSum(int[] nums) {
        //先排序
        int n = nums.length;
        Arrays.sort(nums);
        //偶数位求和
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}