package leetcode.q26_删除排序数组中的重复项;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    // 双指针
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
