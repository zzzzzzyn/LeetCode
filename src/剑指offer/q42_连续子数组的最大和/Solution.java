package 剑指offer.q42_连续子数组的最大和;

public class Solution {

    // 动态规划
    public int maxSubArray(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (res[i - 1] > 0) {
                res[i] = res[i - 1] + nums[i];
            } else {
                res[i] = nums[i];
            }
            max = Math.max(res[i], max);
        }
        return max;
    }
}
