package leetcode.q438_找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);

        for (int start = 0, end = p.length() - 1; end < s.length(); end++) {
            char[] array = s.substring(start, end + 1).toCharArray();
            Arrays.sort(array);
            if (Arrays.equals(array, pArray)) {
                res.add(start);
            }
            start++;
        }
        return res;
    }
}
