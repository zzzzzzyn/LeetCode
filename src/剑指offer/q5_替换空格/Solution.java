package 剑指offer.q5_替换空格;

/**
 * Created by xyn on 2020/6/22
 */
public class Solution {

    // s.replace(" ","%20");啊哈哈哈
    // O(n)
    public String replaceSpace(String s) {
        char[] oldStr = s.toCharArray();
        int newLen = oldStr.length;
        for (int i = 0; i < oldStr.length; i++) {
            if (oldStr[i] == ' ') newLen = newLen + 2;
        }

        char[] newStr = new char[newLen];
        int indexOfNew = newStr.length - 1;
        for (int i = oldStr.length - 1; i >= 0; i--) {
            if (oldStr[i] == ' ') {
                newStr[indexOfNew--] = '0';
                newStr[indexOfNew--] = '2';
                newStr[indexOfNew--] = '%';
            } else {
                newStr[indexOfNew--] = oldStr[i];
            }
        }
        return new String(newStr);
    }
}
