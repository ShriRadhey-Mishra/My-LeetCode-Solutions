package Easy;

import java.util.*;

public class Leetcode1047 {
    public static void main(String[] args) {
        Leetcode1047 obj = new Leetcode1047();
        String s = "abbaca";
        System.out.println(s);
        System.out.println(obj.removeDuplicates(s));
    }
    public String removeDuplicates(String s) {
//        Stack Based Approach
//        Stack<Character> stack = new Stack<>();
//        StringBuilder output = new StringBuilder();
//
//        for (char ch: s.toCharArray()) {
//            if (!stack.isEmpty()){
//                char a = stack.peek();
//                if (a == ch) stack.pop();
//                else stack.add(ch);
//            } else stack.add(ch);
//        }
//
//        for (char c: stack) output.append(c);
//        return output.toString();

//        Using String Builders
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else {
               sb.append(ch);
            }
        }
        return sb.toString();

    }
}
