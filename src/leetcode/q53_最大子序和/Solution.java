package leetcode.q53_最大子序和;

/**
 * Created by xyn on 2020/7/28
 */
public class Solution {

    // dp(i) = dp(i-1) + nums[i]     if dp(i-1) >= 0
    // dp(i) = nums[i]               if dp(i-1) < 0
    // dp(i) = max(dp(i-1) + nums[i], nums[i])
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            if (sum >= 0) {
                sum = sum + num;
            } else {
                sum = num;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
