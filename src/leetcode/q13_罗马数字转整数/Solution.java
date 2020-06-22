package leetcode.q13_罗马数字转整数;

/**
 * Created by xyn on 2020/4/19
 */
public class Solution {

    // O(n)
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getInt(s.charAt(i)) < getInt(s.charAt(i + 1))) {
                res -= getInt(s.charAt(i));
            } else {
                res += getInt(s.charAt(i));
            }

        }
        return res;
    }

    private int getInt(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}
