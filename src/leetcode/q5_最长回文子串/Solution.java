package leetcode.q5_最长回文子串;


/**
 * Created by xyn on 2020/2/28
 */
public class Solution {

    /**
     * 有n+n-1ge扩展中心
     * n：每个位置都是一个扩展中心
     * n-1：每两个位置都是一个扩展中心
     * 时间复杂度O(n^2)
     */
    public String longestPalindrome(String s) {
        if (s == null || "".equals(s)) return "";
        // 1. 取出两中心
        // 2. 取出中心两边的回文串
        int start = 0;
        int end = 0;
        // i为中心
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            len1 = Math.max(len1, len2);
            if (len1 > end - start) {
                start = i - (len1 - 1) / 2;
                end = i + len1 / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, Integer left, Integer right) {
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}

