package leetcode.q209_长度最小的子数组;

public class Solution {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0, min = Integer.MAX_VALUE, start = 0, end = 0;
        while (end < nums.length) {
            count = count + nums[end];
            while (count >= s) {
                min = Math.min(min, end - start + 1);
                count = count - nums[start];
                start++;
            }
            end++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
