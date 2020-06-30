package 剑指offer.q29_顺时针打印矩阵;

public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        int index = 0;
        int[] res = new int[(r + 1) * (b + 1)];

        while (true) {
            // 从左到右
            for (int i = l; i <= r; i++) res[index++] = matrix[t][i];
            if (++t > b) break;
            // 从上到下
            for (int i = t; i <= b; i++) res[index++] = matrix[i][r];
            if (l > --r) break;
            // 从右到左
            for (int i = r; i >= l; i--) res[index++] = matrix[b][i];
            if (t > --b) break;
            // 从下往上
            for (int i = b; i >= t; i--) res[index++] = matrix[i][l];
            if (++l > r) break;
        }

        return res;
    }
}
