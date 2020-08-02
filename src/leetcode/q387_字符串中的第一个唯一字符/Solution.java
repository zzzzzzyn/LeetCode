package leetcode.q387_字符串中的第一个唯一字符;

import java.util.HashMap;

/**
 * Created by xyn on 2020/8/2
 */
public class Solution {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)return i;
        }
        return -1;
    }

}