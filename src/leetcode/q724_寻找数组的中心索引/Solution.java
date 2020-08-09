package leetcode.q724_寻找数组的中心索引;

public class Solution {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] - leftSum == leftSum) return i;
            leftSum = leftSum + nums[i];
        }

        return -1;
    }
}
