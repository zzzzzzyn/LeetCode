package leetcode.q153_寻找旋转排序数组中的最小值;

public class Solution {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (nums[left] > nums[right]) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}