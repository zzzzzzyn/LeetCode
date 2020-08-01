package leetcode.q120_三角形最小路径和;

import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() < 1) return 0;
        if (triangle.size() < 2) return triangle.get(0).get(0);
        int[][] dp = new int[triangle.size()][triangle.size()];
        // 前两行可以特殊处理
        dp[0][0] = triangle.get(0).get(0);
        dp[1][0] = triangle.get(1).get(0) + dp[0][0];
        dp[1][1] = triangle.get(1).get(1) + dp[0][0];

        for (int i = 2; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
            }
        }

        int min = dp[dp.length - 1][0];
        for (int i = 1; i < dp.length; i++) {
            min = Math.min(dp[dp.length - 1][i], min);
        }
        return min;
    }
}
