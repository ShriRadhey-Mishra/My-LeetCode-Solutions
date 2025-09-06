package Easy;

import java.util.*;


public class Leetcode682 {
    public static void main(String[] args) {
        Leetcode682 obj = new Leetcode682();
        String[] arr = {"5", "2", "C", "D", "+"};
        System.out.println(obj.calPoints(arr));

    }

    public int calPoints(String[] operations) {
//        Stack based approach
//        Stack<Integer> stack = new Stack<>();
//        for (String op : operations) {
//            if (Objects.equals(op, "C")) stack.pop();
//            else if (Objects.equals(op, "D")) stack.push(stack.peek() * 2);
//            else if (Objects.equals(op, "+")) {
//                int a = stack.pop();
//                int b = stack.pop();
//                stack.push(a + b);
//            } else stack.push(Integer.parseInt(op));
//        }
//
//        int sum = 0;
//        while (!stack.isEmpty()) sum += stack.pop();
//        return sum;

//        Array Bases Approach
        int size = operations.length;
        int[] arr = new int[size];

        int i = 0;
        for (String op : operations) {
            if (Objects.equals(op, "C")) arr[--i] = 0;
            else if (Objects.equals(op, "D")) {
                arr[i] = arr[i - 1] * 2;
                i++;
            } else if (Objects.equals(op, "+")) {
                arr[i] = arr[i - 1] + arr[i - 2];
                i++;
            } else {
                arr[i] = Integer.parseInt(op);
                i++;
            }
        }

        i = 0;
        for (int num : arr) i += num;

        return i;

    }
}
