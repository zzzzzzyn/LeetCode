package leetcode.q17_电话号码的字母组合;

import java.util.*;

/**
 * Created by xyn on 2020/6/21
 */
public class Solution {

    // 排列组合
    public List<String> letterCombinations(String digits) {

        Map<Character, String[]> phone = new HashMap<Character, String[]>() {{
            put('2', new String[]{"a", "b", "c"});
            put('3', new String[]{"d", "e", "f"});
            put('4', new String[]{"g", "h", "i"});
            put('5', new String[]{"j", "k", "l"});
            put('6', new String[]{"m", "n", "o"});
            put('7', new String[]{"p", "q", "r", "s"});
            put('8', new String[]{"t", "u", "v"});
            put('9', new String[]{"w", "x", "y", "z"});
        }};

        List<String> res = new ArrayList<>();

        if (digits.length() == 0) return res;

        int i = 0;
        while (i < digits.length()) {
            char current = digits.charAt(i);
            String[] strArray = phone.get(current);
            if (res.size() == 0) {
                for (String s : strArray) {
                    res.add(s);
                }
            } else {
                List<String> temp = new ArrayList<>(res);
                res.clear();
                for (String inside : temp) {
                    for (String outside : strArray) {
                        res.add(inside + outside);
                    }
                }
            }
            i++;
        }
        return res;
    }
}
