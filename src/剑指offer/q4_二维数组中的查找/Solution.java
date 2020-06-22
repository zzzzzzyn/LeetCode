package 剑指offer.q4_二维数组中的查找;

/**
 * Created by xyn on 2020/6/22
 */
public class Solution {

    //     [1,   4,  7, 11, 15]
    //     [2,   5,  8, 12, 19]
    //     [3,   6,  9, 16, 22]
    //     [10, 13, 14, 17, 24]
    //     [18, 21, 23, 26, 30]
    //因为从上往下，从左往右都是递增的
    //当target为12时，横坐标确定到11位置，而纵坐标确定到10位置
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        for (int i = 0; i < matrix.length && matrix[i][0] <= target; i++) {
            for (int j = 0; j < matrix[i].length && matrix[i][j] <= target; j++) {
                if (target == matrix[i][j]) return true;
            }
        }
        return false;


//
// for (int i = 0; i < matrix.length; i++) {
//            // 因为递增，查看最大值是否大于target
//            int len = matrix[i].length - 1;
//            if (target > matrix[i][len]) {
//                continue;
//            }
//
//            for (int j = 0; j < matrix[i].length; j++) {
//
//            }
//        }
    }
}

//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//        at line 5, Solution.findNumberIn2DArray
//        at line 57, __DriverSolution__.__helper__
//        at line 84, __Driver__.main
