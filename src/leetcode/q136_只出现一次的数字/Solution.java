package leetcode.q136_只出现一次的数字;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = nums[i] ^ res;
        }
        return res;
    }
}
