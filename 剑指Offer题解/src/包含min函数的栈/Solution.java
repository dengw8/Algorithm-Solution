package 包含min函数的栈;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<>();

    int min = Integer.MAX_VALUE;

    public void push(int node) {
        if(node < min) min = node;
        stack.push(node);
    }

    public void pop() {
        int top = stack.pop();
        if(min == top) {
            min = stack.peek();
            Stack<Integer> tem = new Stack<>();
            while(!stack.empty()) {
                if(min > stack.peek()) min = stack.peek();
                tem.push(stack.pop());
            }
            while(!tem.empty()) {
                stack.push(tem.pop());
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}