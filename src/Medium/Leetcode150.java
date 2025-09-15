package Medium;

import java.util.Stack;

public class Leetcode150 {
    public static void main(String[] args) {
        Leetcode150 obj = new Leetcode150();
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(obj.evalRPN(tokens));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String ex : tokens) {
            switch (ex) {
                case "+" -> {
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a + b);
                }
                case "-" -> {
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a - b);
                }
                case "*" -> {
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a * b);
                }
                case "/" -> {
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a / b);
                }
                default -> stack.push(Integer.parseInt(ex));
            }

        }
        return stack.pop();
    }
}
