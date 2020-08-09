package leetcode.q56_合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        // 先排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);

        int start = 0, end = 0;
        List<List<Integer>> resList = new ArrayList<>();
        while (start < intervals.length) {
            while (end < intervals.length && intervals[start][1] >= intervals[end][0]) {
                intervals[start][1] = Math.max(intervals[start][1], intervals[end][1]);
                end++;
            }
            resList.add(Arrays.asList(intervals[start][0], intervals[start][1]));
            start = end;
        }

        int[][] res = new int[resList.size()][2];
        for (int i = 0; i < resList.size(); i++) {
            for (int j = 0; j < resList.get(i).size(); j++) {
                res[i][j] = resList.get(i).get(j);
            }
        }
        return res;
    }
}
