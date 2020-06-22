package 剑指offer.q3_数组中的重复数字;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyn on 2020/6/22
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                return nums[i];
            }
        }
        return 0;
    }

    // [2,3,1,0,2,5,3]
    public int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }

}
