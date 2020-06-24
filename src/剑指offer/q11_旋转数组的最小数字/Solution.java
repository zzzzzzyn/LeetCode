package 剑指offer.q11_旋转数组的最小数字;//package 剑指offer.q11_旋转数组的最小数字;

public class Solution {

    public int minArray(int[] numbers) {
        int l = 0;
        int r = numbers.length - 1;
        int m = 0;

        while (l != r) {
            m = (l + r) / 2;

            if (numbers[m] > numbers[r]) {
                // 右边
                l = m + 1;
            } else if (numbers[m] < numbers[r]) {
                // 左边
                r = m;
            } else {
                // 相等，不知左右
                r--;
            }
        }
        return numbers[l];
    }
}
