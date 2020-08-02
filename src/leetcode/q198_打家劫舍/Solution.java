package leetcode.q198_打家劫舍;

/**
 * Created by xyn on 2020/2/24
 */
public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        // dp(i) = max(dp(i-2)+nums[i],dp(i-1))  i>1
        int max = 0;
        int pre = nums[0];
        int next = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            max = Math.max(pre + nums[i], next);
            pre = next;
            next = max;
        }
        return max;
    }
}