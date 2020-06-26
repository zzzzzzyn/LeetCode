package 剑指offer.q14_剪绳子;

/**
 * Created by xyn on 2020/6/25
 */
public class Solution {

    public static int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        // 记录最大的乘积
        int[] product = new int[n + 1];
        product[1] = 1;
        // 和下面同理
        product[2] = 2;
        // 这里为什么是3不是2，因为当长度为4的时候，剪到3的时候就没必要再减了
        product[3] = 3;

        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (max < product[j] * product[i - j]) {
                    max = product[j] * product[i - j];
                }
            }
            product[i] = max;
        }
        return product[n];
    }
}
