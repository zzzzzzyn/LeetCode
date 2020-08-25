package leetcode.q498_对角线遍历;

import java.util.ArrayList;

public class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {
        int i = 0, j = 0, l = 0;
        boolean goingDown = false;
        int[] res = new int[matrix.length * matrix[0].length];

        while (i < matrix.length && j < matrix[0].length) {
            res[l] = matrix[i][j];
            if (goingDown) {
                i++;
                if (j != 0) j--;
            } else {
                if (i != 0) i--;
                j++;
            }
            if (i == 0 || j == 0) goingDown = !goingDown;
        }

        return res;
    }

    public int[] findDiagonalOrder2(int[][] matrix) {
        int index = 0;
        int[] res = new int[matrix.length * matrix[0].length];

        for (int k = 0; k < matrix[0].length; k++) {

            int i = 0, j = k;
            ArrayList<Integer> list = new ArrayList<>();
            while (i < matrix.length && j >= 0) {
                list.add(matrix[i][j]);
                i++;
                j--;
            }

            if (k % 2 == 0) {
                // 倒序
                for (int m = list.size() - 1; m >= 0; m--) {
                    res[index++] = list.get(m);
                }
            } else {
                // 正序
                for (int m = 0; m < list.size(); m++) {
                    res[index++] = list.get(m);
                }
            }
            list.clear();
        }
        return res;
    }

}
