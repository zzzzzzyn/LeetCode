package leetcode.q345_反转字符串中的元音字母;

import java.util.Arrays;
import java.util.List;

public class Solution {


    public String reverseVowels(String s) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !list.contains(chars[left])) {
                left++;
            }

            while (right > left && !list.contains(chars[right])) {
                right--;
            }

            if (left < right && list.contains(chars[left]) && list.contains(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;

                left++;
                right--;
            }
        }

        return String.valueOf(chars);
    }


    public String reverseVowels2(String s) {
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!list.contains(chars[left])) {
                left++;
                continue;
            }

            if (!list.contains(chars[right])) {
                right--;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        return String.valueOf(chars);
    }
}