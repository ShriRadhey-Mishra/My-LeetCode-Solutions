package Easy;

import java.util.*;

public class Leetcode3174 {
    public static void main(String[] args) {
        Leetcode3174 obj = new Leetcode3174();
        String s = "abc12";
        String sClear = obj.clearDigits(s);
        System.out.println(s);
        System.out.println(sClear);
    }

    public String clearDigits(String s) {
//        3ms Solution
//        Stack<Character> stack = new Stack<>();
//        String sb = "";
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if ((s.charAt(i) - '0') / 10 == 0) {
//                stack.pop();
//            } else {
//                stack.push(s.charAt(i));
//            }
//        }
//
//        while (!stack.isEmpty()) {
//            sb = stack.pop().toString() + sb;
//        }
//        return sb;

//        1ms Solution
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean digit = Character.isDigit(ch);
            if (!digit) sb.append(ch);
            else sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
