package leetcode.q240_搜索二维矩阵II;

/**
 * @author: xuyanan
 * @date: 2022/8/8
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        // 从左上角当做二叉树来搜索，上边的值小，右边的值大
        int m = matrix.length - 1, n = 0;
        while (m >= 0 && n < matrix[0].length) {
            if (matrix[m][n] == target) {
                return true;
            } else if (target < matrix[m][n]) {
                m--;
            } else {
                n++;
            }
        }

        return false;
    }
}
