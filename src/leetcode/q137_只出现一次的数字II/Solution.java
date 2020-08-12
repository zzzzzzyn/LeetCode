package leetcode.q137_只出现一次的数字II;

import java.util.HashSet;

public class Solution {

    // 可能越界
    // 数学方式 3*(a+b+c) - (a+a+a+b+b+b+c) = 2c
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            sumLeft += nums[i];
        }

        for (Integer num : set) {
            sumRight += num;
        }

        return (3 * sumRight - sumLeft) / 2;

    }
}
