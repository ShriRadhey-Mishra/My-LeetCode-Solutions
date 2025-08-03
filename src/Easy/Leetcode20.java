package Leetcode.src.Easy;

import java.util.*;

public class Leetcode20 {
    public boolean isValid(String s) {
        if (Objects.equals(s,"")) return true;
        if (s.length() == 1) return false;
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        char[] cArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == '(' || cArr[i] =='{' || cArr[i] == '[') {
                stack.push(cArr[i]);
            } else if (cArr[i] == ')' || cArr[i] == '}' || cArr[i] == ']') {
                try {char a = stack.getLast();
                char b = 0;
                switch (a) {
                    case '(' -> b = ')';
                    case '[' -> b = ']';
                    case '{' -> b = '}';
                }
                if (b == cArr[i]) stack.pop();
                else stack.push(cArr[i]);} catch (Exception e) { return false; }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode20 obj = new Leetcode20();
        String s = "()[]{}";
        System.out.println(obj.isValid(s));
    }
}