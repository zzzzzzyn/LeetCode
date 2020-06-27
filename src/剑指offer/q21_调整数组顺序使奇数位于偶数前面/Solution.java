package 剑指offer.q21_调整数组顺序使奇数位于偶数前面;

/**
 * Created by xyn on 2020/6/27
 */
public class Solution {

    public int[] exchange(int[] nums) {
        if (nums.length == 0) return new int[]{};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }

            while (right > left && nums[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;
    }
}
