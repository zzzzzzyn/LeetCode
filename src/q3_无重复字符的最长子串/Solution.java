package q3_无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xyn on 2020/2/27
 */
public class Solution {

    /**
     * 暴力解
     */
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> result = new HashSet<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                if (result.contains(array[j])) {
                    break;
                }
                result.add(array[j]);
            }
            if (result.size() > max) {
                max = result.size();
            }
            result.clear();
        }
        return max;
    }
}

