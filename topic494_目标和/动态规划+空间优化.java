public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int[] dp = new int[2001];
        dp[nums[0] + 1000] = 1;
        dp[-nums[0] + 1000] += 1;
        for (int i = 1; i < nums.length; i++) {
            int[] next = new int[2001];
            for (int sum = -1000; sum <= 1000; sum++) {
                if (dp[sum + 1000] > 0) {
                    next[sum + nums[i] + 1000] += dp[sum + 1000];
                    next[sum - nums[i] + 1000] += dp[sum + 1000];
                }
            }
            dp = next;
        }
        return S > 1000 ? 0 : dp[S + 1000];
    }
}
//我们发现，方法二中动态规划的状态转移方程中，dp[i][...] 只和 dp[i - 1][...] 有关，因此我们可以优化动态规划的空间复杂度，只需要使用两个一维数组即可。
//复杂度分析
//时间复杂度：O(N*\text{sum})O(N∗sum)，其中 NN 是数组 nums 的长度。
//空间复杂度：O(\text{sum})O(sum)
