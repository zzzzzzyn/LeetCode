package leetcode.q485_最大连续1的个数;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                slow = fast + 1;
            }
            max = Math.max(max, fast - slow + 1);
            fast++;
        }
        return max;
    }
}
