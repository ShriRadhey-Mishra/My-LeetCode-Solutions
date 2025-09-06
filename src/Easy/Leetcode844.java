package Easy;

import java.util.*;

public class Leetcode844 {
    public static void main(String[] args) {
        Leetcode844 obj = new Leetcode844();
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(obj.backspaceCompare(s, t));
    }
    public boolean backspaceCompare(String s, String t) {
//        Stack Based Approach
//        if (Objects.equals(s, t)) return true;
//
//        Stack<Character> stack1 = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (stack1.isEmpty() && s.charAt(i) == '#') continue;
//            else if (s.charAt(i) == '#') stack1.pop();
//            else stack1.push(s.charAt(i));
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            if (stack2.isEmpty() && t.charAt(i) == '#') continue;
//            else if (t.charAt(i) == '#') stack2.pop();
//            else stack2.push(t.charAt(i));
//        }
//
//        return stack1.equals(stack2);

//        StringBuilder Approach
        if (Objects.equals(s, t)) return true;

        StringBuilder s1 = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (s1.isEmpty() && ch == '#') continue;
            else if (ch == '#') s1.deleteCharAt(s1.length()-1);
            else s1.append(ch);
        }

        StringBuilder t1 = new StringBuilder();
        for (char ch : t.toCharArray()) {
            if (t1.isEmpty() && ch == '#') continue;
            else if (ch == '#') t1.deleteCharAt(t1.length()-1);
            else t1.append(ch);
        }

        return s1.toString().contentEquals(t1);
    }
}
