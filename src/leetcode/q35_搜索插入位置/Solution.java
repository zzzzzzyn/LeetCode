package leetcode.q35_搜索插入位置;

public class Solution {

    // 找到第一个大于等于target的元素索引
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                res = i;
                break;
            }
        }
        return target > nums[nums.length - 1] ? nums.length : res;
    }

    // 二分法 时间复杂度O(log(n)),找到第一个大于等于target的元素
}
