package leetcode.q244_数组拆分I;

import java.util.Arrays;

public class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            res = res + Math.min(nums[i], nums[i + 1]);
        }
        return res;
    }

}
