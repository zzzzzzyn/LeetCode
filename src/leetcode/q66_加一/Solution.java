package leetcode.q66_加一;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOne2(int[] digits) {
        digits[digits.length - 1]++;
        int i = digits.length - 1;
        while (i >= 1) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            } else {
                break;
            }
            i--;
        }
        if (digits[i] == 10) {
            digits[i] = 0;
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int j = 1; j < res.length; j++) {
                res[j] = digits[j - 1];
            }
            return res;
        } else {
            return digits;
        }
    }
}
