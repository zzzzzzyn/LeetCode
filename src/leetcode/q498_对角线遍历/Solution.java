package leetcode.q498_对角线遍历;

public class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {

        int[] res = new int[matrix.length * matrix[0].length];
        // 方向变量
        boolean goingDown = false;
        int l = 0, r = 0, i = 0;
        while (l < matrix.length && r < matrix[0].length) {
            res[i] = matrix[l][r];
            if (goingDown) {
                l++;
            } else {
                r++;
            }

        }
        return null;
    }
}
