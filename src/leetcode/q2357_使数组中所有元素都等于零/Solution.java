package leetcode.q2357_使数组中所有元素都等于零;

import java.util.HashSet;

public class Solution {

    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        return set.size();
    }

}