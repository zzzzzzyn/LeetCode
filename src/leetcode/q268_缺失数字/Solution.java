package leetcode.q268_缺失数字;

public class Solution {

    // ^ 运算(1^1=0,0^1=1)
    public int missingNumber(int[] nums) {
        int res = 0, mask = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ (nums[i] ^ mask);
            mask++;
        }
        return res ^ mask;
    }
}