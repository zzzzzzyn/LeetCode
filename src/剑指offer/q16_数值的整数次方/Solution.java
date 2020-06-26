package 剑指offer.q16_数值的整数次方;

/**
 * Created by xyn on 2020/6/26
 */
public class Solution {

    public static double myPow(double x, int n) {
        if (x == 0) return 0;
        if (x == 1) return x;

        if (n == 0) return 1;
        double res = powerWithUnsigned(x, Math.abs(n));
        if (n < 0) res = 1 / res;
        return res;
    }

    // 两种情况
    // n为奇数 x^n=x*x^((n-1)/2)*x^((n-1)/2)
    // n为偶数 x^n=x^(n/2)*x^(n/2)
    public static double powerWithUnsigned(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double res = powerWithUnsigned(x, n / 2);
        res = res * res;
        if (n % 2 == 1) res = res * x;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
        System.out.println(Math.pow(2, -2147483648));
    }

}
