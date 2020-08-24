package 面试题.q1_8_零矩阵;

import java.util.HashSet;

public class Solution {

    public void setZeroes(int[][] matrix) {
        // 收集0所在的行列
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (row.contains(i)) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }

            if (!col.isEmpty()) {
                for (Integer k : col) {
                    matrix[i][k] = 0;
                }
            }
        }
    }
}
