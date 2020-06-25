package 剑指offer.q13_机器人的运动范围;

/**
 * 深度遍历
 * Created by xyn on 2020/6/25
 */
public class DFS {

    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    // i,横坐标,j,纵坐标,si,横坐标和,sj,纵坐标和
    private int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || k < si + sj || visited[i][j]) return 0;

        visited[i][j] = true;
        return 1 + dfs(i + 1, j, getDigitSum(i + 1), getDigitSum(j))
                + dfs(i, j + 1, getDigitSum(i), getDigitSum(j + 1));
    }

    private int getDigitSum(int num) {
        int res = 0;
        while (num > 0) {
            res = res + num % 10;
            num = num / 10;
        }
        return res;
    }
}
