package leetcode.q27_移除元素;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    // 双指针
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
