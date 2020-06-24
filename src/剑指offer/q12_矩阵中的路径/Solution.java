package 剑指offer.q12_矩阵中的路径;

public class Solution {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        // 越界，与目标字符不匹配，返回
        // 这里'/'不用盼，毕竟words中没有元素等于'/'
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[k]) {
            return false;
        }

        // 这里使用k与长度作比较而没有比较内容，是因为上面的判断已经做了，肯定是相等的才会到这里
        if (k == words.length - 1) {
            return true;
        }

        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, words, i - 1, j, k + 1) || dfs(board, words, i + 1, j, k + 1)
                || dfs(board, words, i, j - 1, k + 1) || dfs(board, words, i, j + 1, k + 1);

        board[i][j] = tmp;
        return res;
    }
}
