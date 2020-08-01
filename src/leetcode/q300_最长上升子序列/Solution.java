package leetcode.q300_最长上升子序列;

/**
 * Created by xyn on 2020/7/28
 */
public class Solution {

    // dp[i] = max(dp[j]+1 , dp[k]+1, dp[l]+1)
    // nums[i]>nums[j]  nums[i]>nums[k]  nums[i]>nums[l]
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int maxres = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxres = Math.max(maxres, dp[i]);
        }
        return maxres;
    }


}
