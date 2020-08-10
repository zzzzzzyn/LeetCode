package 面试题.q1_7_旋转矩阵;

public class Solution {

    public void rotate(int[][] matrix) {
        // 转几圈
        for (int i = 0; i < matrix.length / 2; i++) {
            // 起始位置
            for (int j = i; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = tmp;
            }
        }
    }
}
