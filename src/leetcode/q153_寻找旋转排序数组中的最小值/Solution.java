package leetcode.q153_寻找旋转排序数组中的最小值;

import java.util.Arrays;

public class Solution {

    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}