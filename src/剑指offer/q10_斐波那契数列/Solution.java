package 剑指offer.q10_斐波那契数列;

/**
 * Created by xyn on 2020/6/23
 */
public class Solution {

    public static int fib(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int fibOne = 1;
        int fibTwo = 0;
        int res = 0;

        for (int i = 2; i <= n; i++) {
            res = (fibOne + fibTwo) % 1000000007;
            fibTwo = fibOne;
            fibOne = res;
        }

        return res;
    }
}
