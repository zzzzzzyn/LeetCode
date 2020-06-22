package leetcode.q7_整数反转;

/**
 * Created by xyn on 2020/4/16
 */
public class Solution {

    // 时间复杂度O(n)
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            int pop = x % 10;
            temp = temp * 10 + pop;

            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) return 0;

            x = x / 10;
        }
        return (int) temp;
    }
}
