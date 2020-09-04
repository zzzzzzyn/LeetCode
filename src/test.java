import java.util.Deque;
import java.util.LinkedList;

/**
 * 394字符串解码
 */
public class Solution {

    public String decodeString(String s) {
        Deque<String> deque = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                String str = "";
                while (!deque.peekLast().equals("[")) {
                    str = deque.pollLast() + str;
                }
                deque.pollLast();    // "["
                String numStr = "";
                while (Integer.valueOf(deque.peekLast()) >= 0 && Integer.valueOf(deque.peekLast()) <= 9) {
                    numStr = deque.pollLast() + numStr;
                }
                Integer num = Integer.valueOf(numStr);    // '数字'
                String substr = "";
                while (num > 0) {
                    substr += str;
                    num--;
                }
                deque.offerLast(substr);
            } else {
                deque.offerLast(String.valueOf(c));
            }
        }

        StringBuilder res = new StringBuilder();
        while (!deque.isEmpty()) {
            res.append(deque.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = new test().decodeString("3[a]2[bc]");
        System.out.println(s);
    }
}
