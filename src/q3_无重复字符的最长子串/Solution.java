package q3_无重复字符的最长子串;

import java.util.HashMap;
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
            max = Math.max(result.size(), max);
            result.clear();
        }
        return max;
    }

    /**
     * 滑动窗口
     */
    public int lengthOfLongestSubstring2(String s) {
        char[] array = s.toCharArray();
        // 最后返回的长度
        int result = 0;
        // 记录每个一个不同字符的长度
        int length = 0;
        // 头指针
        int start = 0;
        // 尾指针
        int end = 0;
        int size = array.length;
        while (end < size) {
            char current = array[end];
            for (int i = start; i < end; i++) {
                if (array[i] == current) {
                    start = i + 1;
                    length = end - start;
                    break;
                }
            }
            end++;
            length++;
            result = Math.max(length, result);
        }
        return result;
    }

    /**
     * 滑动窗口2
     */
    public int lengthOfLongestSubstring3(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // 替换窗口最左侧的值，相当于最左侧出栈
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            // 计算窗口中的值
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

}

