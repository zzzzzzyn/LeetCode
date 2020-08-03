package leetcode.q796_旋转字符串;

/**
 * Created by xyn on 2020/8/2
 */
public class Solution {

    // 暴力解
    public boolean rotateString(String A, String B) {
        if (A.isEmpty() && B.isEmpty()) return true;
        if (A.isEmpty() || B.isEmpty()) return false;

        int index = 0;
        StringBuilder sb = new StringBuilder(A);
        while (index < A.length()) {
            if (sb.toString().equals(B)) return true;
            char c = sb.charAt(0);
            sb.deleteCharAt(0).append(c);
            index++;
        }
        return false;
    }

    public boolean rotateString2(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    // KMP
//    public boolean rotateString3(String A, String B) {
//
//    }

}