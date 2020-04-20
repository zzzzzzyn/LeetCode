package q14_最长公共前缀;

/**
 * Created by xyn on 2020/4/20
 */
public class Solution {

    // O(n)，两两比较找出公共前缀
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            if ("".equals(res)) break;
        }
        return res;
    }
}
