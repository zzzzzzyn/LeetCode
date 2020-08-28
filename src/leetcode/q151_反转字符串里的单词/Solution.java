package leetcode.q151_反转字符串里的单词;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!sb.toString().isEmpty()) list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));
            }
        }
        if (!sb.toString().isEmpty()) list.add(sb.toString());

        sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }

        return sb.toString().trim();
    }
}
