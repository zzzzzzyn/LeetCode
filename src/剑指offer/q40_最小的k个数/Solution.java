package 剑指offer.q40_最小的k个数;

import java.util.Arrays;

public class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }
}
