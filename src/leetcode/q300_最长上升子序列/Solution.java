package leetcode.q300_最长上升子序列;

/**
 * Created by xyn on 2020/7/28
 */
public class Solution {

    // [10, 9, 2, 5, 3, 7, 101, 18]
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxres = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(dp[j], maxval);
                }
            }
            dp[i] = maxval + 1;
            maxres = Math.max(dp[i], maxres);
        }
        return maxres;
    }
}
