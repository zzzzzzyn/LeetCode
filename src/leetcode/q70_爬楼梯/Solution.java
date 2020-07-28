package leetcode.q70_爬楼梯;

/**
 * Created by xyn on 2020/7/28
 */
public class Solution {

    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1 || n == 2) return n;

        int i1 = 1;
        int i2 = 2;

        for (int i = 3; i <= n; i++) {
            int tmp = i1 + i2;
            i1 = i2;
            i2 = tmp;
        }
        return i2;
    }
}
