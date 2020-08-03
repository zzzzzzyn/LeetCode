package leetcode.q415_字符串相加;

public class Solution {

    public String addStrings(String num1, String num2) {
        if (num1.isEmpty()) return num2;
        if (num2.isEmpty()) return num1;

        StringBuilder res = new StringBuilder();
        int len = num1.length() < num2.length() ? num2.length() : num1.length();
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        // 是否进位
        int sum = 0;
        int index = 0;
        while (index < len) {
            if (index < num1.length()) {
                sum += Integer.valueOf(num1.substring(index, index + 1));
            }
            if (index < num2.length()) {
                sum += Integer.valueOf(num2.substring(index, index + 1));
            }

            index++;
            res.append(sum % 10);
            if (sum / 10 == 1) {
                sum = sum / 10;
            } else {
                sum = 0;
            }
        }

        if (sum == 1) {
            res = res.append(sum);
        }

        return res.reverse().toString();
    }

    public String addStrings2(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }
}
