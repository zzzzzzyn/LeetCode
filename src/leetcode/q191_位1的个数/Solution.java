package leetcode.q191_位1的个数;

public class Solution {

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res = res + (n & 1);
            n = n >>> 1;
        }
        return res;
    }
}