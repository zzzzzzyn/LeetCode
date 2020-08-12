package leetcode.q905_按奇偶排序数组;

public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            while (left < A.length && A[left] % 2 == 0) {
                left++;
            }
            while (right >= 0 && A[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
        }
        return A;
    }

    public int[] sortArrayByParity2(int[] A) {
        int[] res = new int[A.length];
        int t = 0;

        // 输出偶数
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[t++] = A[i];
            }
        }

        // 输出奇数
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                res[t++] = A[i];
            }
        }

        return res;
    }
}

