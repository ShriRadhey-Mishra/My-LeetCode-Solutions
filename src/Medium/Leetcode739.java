package Medium;

import java.util.*;

public class Leetcode739 {
    public static void main(String[] args) {
        Leetcode739 obj = new Leetcode739();
        int[] temps = {73,74,75,71,69,72,76,73};
        int[] waitForWarmer = obj.dailyTemperatures(temps);
        System.out.println(Arrays.toString(temps));
        System.out.println(Arrays.toString(waitForWarmer));
    }

    public int[] dailyTemperatures(int[] temperatures) {
//        Brute Force Approach - O(n^2)
//        int current = 0;
//        int range = temperatures.length;
//        int[] stack = new int[range];
//
//        while (current < range) {
//            int wait = 0;
//            for (int i = current + 1; i < range; i++) {
//                if (temperatures[i] > temperatures[current]) {
//                    wait++;
//                    break;
//                } else {
//                    if ((i == range - 1)) {
//                        wait = 0;
//                    } else {
//                        wait++;
//                    }
//                }
//            }
//            stack[current] = wait;
//            current++;
//        }
//
//        return stack;

////        Monotonic Stack Approach
//        int n = temperatures.length;
//        int[] answer = new int[n];
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < n; i++) {
//
//            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
//                int prevIndex = stack.pop();
//                answer[prevIndex] = i - prevIndex;
//            }
//            stack.push(i);
//        }
//
//        return answer;

//        Using Arrays as Stack
        int n = temperatures.length;
        int[] answer = new int[n];
        int[] stack = new int[n]; // manual stack to store indices
        int top = -1; // pointer to top of stack

        for (int i = 0; i < n; i++) {
            // pop while current temp is hotter than the temp at the stack's top index
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int prevIndex = stack[top--];
                answer[prevIndex] = i - prevIndex;
            }
            stack[++top] = i; // push current index
        }

        return answer;
    }
}
