package leetcode.q27_移除元素;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    // 快慢指针
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
