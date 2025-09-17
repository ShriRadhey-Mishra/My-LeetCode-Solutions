package Medium;

import java.util.Stack;

public class Leetcode394 {
    public static void main(String[] args) {
        Leetcode394 obj = new Leetcode394();
        String str = "3[a2[c]]";
        System.out.println(obj.decodeString(str));

    }
    public String decodeString(String s) {
       Stack<Integer> num = new Stack<>();
       Stack<String> str = new Stack<>();
       int index = 0;
       StringBuilder curr = new StringBuilder();

       while (index < s.length()) {
           if (Character.isDigit(s.charAt(index))) {
               int n = 0;
               while (index < s.length() && Character.isDigit(s.charAt(index))) {
                   n = n * 10 + (s.charAt(index) - '0');
                   index++;
               }
               num.push(n);
           } else if (s.charAt(index) == '[') {
               str.push(curr.toString());
               curr = new StringBuilder();
               index++;
           } else if (s.charAt(index) == ']') {
               int repeat = num.pop();
               String prev = str.pop();
               curr = new StringBuilder(prev + curr.toString().repeat(repeat));
               index++;
           } else {
               curr.append(s.charAt(index));
               index++;
           }
       }

       return curr.toString();
    }
}
