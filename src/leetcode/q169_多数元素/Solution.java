package leetcode.q169_多数元素;

import java.util.HashMap;

public class Solution {

    /**
     * 摩尔投票法
     */
    public int majorityElement(int[] nums) {
        int mode = nums[0];
        int vote = 0;

        for (int num : nums) {

            if (vote == 0) {
                mode = num;
            }

            if (mode == num) {
                vote++;
            } else {
                vote--;
            }

        }
        return mode;
    }

    public int majorityElement2(int[] nums) {
        int count = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > count) return nums[i];
        }
        return 0;
    }

}
