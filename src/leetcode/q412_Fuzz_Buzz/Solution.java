package leetcode.q412_Fuzz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(String.valueOf(i));
        }
        for (int i = 3; i <= n; i = i + 3) {
            list.set(i - 1, "Fizz");
        }
        for (int i = 5; i <= n; i = i + 5) {
            list.set(i - 1, "Buzz");
        }
        for (int i = 15; i <= n; i = i + 15) {
            list.set(i - 1, "FizzBuzz");
        }
        return list;
    }

}