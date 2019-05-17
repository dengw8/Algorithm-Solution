package 栈的压入和弹出序列;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<>();

    public boolean IsPopOrder(int []pushA,int [] popA) {
        int len = pushA.length;
        // 记录popA中数组移动的下标
        int index = 0;
        for(int i = 0; i < len; i++) {
            stack.push(pushA[i]);
            while(!stack.empty() && popA[index] == stack.peek()) {
                index++;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
