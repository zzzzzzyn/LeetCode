package leetcode.q189_旋转数组;

public class Solution {

    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 0 || nums.length == 1) return;
        // k可能会大于nums.length
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}
