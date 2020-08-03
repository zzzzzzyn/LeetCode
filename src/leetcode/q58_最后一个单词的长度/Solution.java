package leetcode.q58_最后一个单词的长度;

public class Solution {

    public int lengthOfLastWord(String s) {
        int lastStrLen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (lastStrLen != 0 && !Character.isLetter(s.charAt(i))) {
                break;
            }
            if (Character.isLetter(s.charAt(i))) {
                lastStrLen++;
            }
        }
        return lastStrLen;
    }

    public int lengthOfLastWord2(String s) {
        int lastStrLen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (lastStrLen == 0) continue;
                break;
            }
            lastStrLen++;
        }
        return lastStrLen;
    }

    public int lengthOfLastWord3(String s) {
        String[] array = s.trim().split(" ");
        return array[array.length - 1].length();
    }
}
