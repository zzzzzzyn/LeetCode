package leetcode.q1331_数组序号转换;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int[] arrayRankTransform(int[] arr) {
        int[] mapper = Arrays.copyOf(arr, arr.length);
        Arrays.sort(mapper);
        HashMap<Integer, Integer> map = new HashMap<>();

        int seq = 1;
        for (int num : mapper) {
            if (!map.containsKey(num)) {
                map.put(num, seq++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

}