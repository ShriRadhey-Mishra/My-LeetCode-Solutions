package Easy;

import java.util.Stack;

class MyQueue {
    private final Stack<Integer> stackA;
    private final Stack<Integer> stackB;

    public MyQueue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
    }

    public int pop() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();

    }

    public int peek() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    public boolean empty() {
        return (stackA.isEmpty() && stackB.isEmpty());
    }
}

public class Leetcode232 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());
    }
}
