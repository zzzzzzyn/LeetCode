package leetcode.q49_字母异位词分组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            String key = str;

            if (key.length() > 0) {
                char[] chars = key.toCharArray();
                Arrays.sort(chars);
                key = String.valueOf(chars);
            }

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> valList : map.values()) {
            result.add(valList);
        }
        return result;
    }

}