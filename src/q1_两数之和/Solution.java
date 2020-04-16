package q1_两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyn on 2020/2/24
 */
public class Solution {

    /**
     * 暴力法
     * 时间复杂度O(n^2)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 利用HashMap缓存
     * 时间复杂度O(n)
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null) {
                result[0] = i;
                result[1] = map.get(dif);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}