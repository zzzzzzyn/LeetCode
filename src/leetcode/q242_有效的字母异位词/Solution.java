package leetcode.q242_有效的字母异位词;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) return false;
        }
        return true;
    }

}
