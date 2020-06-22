package leetcode.q6_Z字型变换;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyn on 2020/4/15
 */
public class Solution {

    // 时间复杂度O(n)
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        // 惊呆啦卧槽，官方解法牛批
        // 1. 列出非空行
        // 2. 用当前行和当前方向两个变量进行跟踪
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        // 方向变量
        boolean goingDown = false;
        // 当前行
        int curRow = 0;
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            // 在首行和尾行变换方向
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : rows) {
            res.append(sb.toString());
        }
        return res.toString();
    }
}
