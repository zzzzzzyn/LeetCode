package q10_正则表达式匹配;

/**
 * Created by xyn on 2020/4/17
 */
public class Solution {

    // https://leetcode-cn.com/problems/regular-expression-matching/solution/javahui-su-he-dong-tai-gui-hua-xiang-xi-dai-ma-zhu/
    // 回溯法
    public boolean isMatch(String s, String p) {
        if(p.isEmpty())return s.isEmpty();

        // 判断首字符是否匹配
        boolean headMatch = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
        // p当前长度大于2且下一个字符为*
        if(p.length() >= 2 && p.charAt(1) == '*'){
            // 判断*的两种情况:
            //  1.匹配一个或多个，截取s
            //  2.匹配0个，从*后截取p
            return isMatch(s, p.substring(2)) || (headMatch && isMatch(s.substring(1), p));
        }else if(headMatch){
            // 首字母相等且下一个字符不为*，从1出截取递归
            return isMatch(s.substring(1), p.substring(1));
        }else{
            return false;
        }
    }

}
