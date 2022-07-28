package leetcode.q347_前K个高频元素;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            list.add(new int[]{key, map.get(key)});
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]){
                    return -1;
                }

                if (o1[1] < o2[1]){
                    return 1;
                }

                return 0;
            }
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i)[0];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2));
    }

}