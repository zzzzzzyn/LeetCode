package 剑指offer.q13_机器人的运动范围;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度遍历
 * Created by xyn on 2020/6/25
 */
public class BFS {

    /**
     * 通过队列是否为空，来做广度遍历搜索
     */
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 0});

        while (queue.size() > 0) {
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if (i >= m || j >= n || k < si + sj || visited[i][j]) continue;
            visited[i][j] = true;
            res++;
            queue.add(new int[]{i + 1, j, getDigitSum(i + 1), getDigitSum(j)});
            queue.add(new int[]{i, j + 1, getDigitSum(i), getDigitSum(j + 1)});
        }
        return res;
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
