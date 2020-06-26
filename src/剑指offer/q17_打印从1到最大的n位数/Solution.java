package 剑指offer.q17_打印从1到最大的n位数;

/**
 * Created by xyn on 2020/6/26
 */
public class Solution {
    public int[] printNumbers(int n) {
        if (n <= 0) return new int[]{};

        int num = 1;
        while (n-- > 0) {
            num = num * 10;
        }

        int[] res = new int[num - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
