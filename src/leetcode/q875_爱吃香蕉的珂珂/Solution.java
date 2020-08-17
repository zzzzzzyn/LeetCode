package leetcode.q875_爱吃香蕉的珂珂;

import java.util.Arrays;

public class Solution {

    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        int maxVal = piles[piles.length - 1];

        int low = 1, high = maxVal;
        while (low < high) {
            int mid = (low + high) / 2;

            int sum = 0;
            for (int pile : piles) {
                sum += (pile - 1) / mid + 1;
            }

            if (sum > H) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil(3 * 1.0 / 5));
    }

}

