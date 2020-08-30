package leetcode.q557_反转字符串中的单词III;

/**
 * Created by xyn on 2020/8/2
 */
public class Solution {

    public String reverseWords(String s) {
        String[] strArray = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            for (int j = strArray[i].toCharArray().length - 1; j >= 0; j--) {
                res.append(strArray[i].charAt(j));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

}