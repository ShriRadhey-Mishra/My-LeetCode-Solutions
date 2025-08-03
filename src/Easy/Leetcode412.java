package Leetcode.src.Easy;

import java.util.*;

public class Leetcode412 {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) fb.add("FizzBuzz");
            else if (i % 3 == 0) fb.add("Fizz");
            else if (i % 5 == 0) fb.add("Buzz");
            else fb.add(""+i);
        }

        return fb;
    }

    public static void main(String[] args) {
        Leetcode412 obj = new Leetcode412();
        int n = 50;
        System.out.println(obj.fizzBuzz(n));
    }
}