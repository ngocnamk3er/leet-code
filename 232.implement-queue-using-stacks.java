/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start

import java.util.Stack;

class MyQueue {

    private Stack<Integer> stackLeft;
    private Stack<Integer> stackRight;

    public MyQueue() {
        stackLeft = new Stack<Integer>();
        stackRight = new Stack<Integer>();
    }

    public void push(int x) {
        stackLeft.push(x);
    }

    public int pop() {
        if (!stackRight.empty()) {
            int x = stackRight.pop();
            return x;
        } else {
            while (!stackLeft.empty()) {
                stackRight.push(stackLeft.pop());
            }
            int x = stackRight.pop();
            return x;
        }
    }

    public int peek() {
        if (!stackRight.empty()) {
            int x = stackRight.peek();
            return x;
        } else {
            while (!stackLeft.empty()) {
                stackRight.push(stackLeft.pop());
            }
            int x = stackRight.peek();
            return x;
        }
    }

    public boolean empty() {
        return stackRight.isEmpty() && stackLeft.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
