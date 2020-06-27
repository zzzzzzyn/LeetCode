package 剑指offer.q19_正则表达式匹配;

/**
 * Created by xyn on 2020/6/27
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();

        // 判断首字符是否匹配
        boolean headMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        // p当前长度大于2且下一个字符为*
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // 判断*的几种情况:
            //  1.直接截取p的*
            //  2.从s的下一字符截取
            return isMatch(s, p.substring(2)) || (headMatch && isMatch(s.substring(1), p));
        } else if (headMatch) {
            // 首字母相等且下一个字符不为*，从1出截取递归
            return isMatch(s.substring(1), p.substring(1));
        } else {
            return false;
        }
    }
}
