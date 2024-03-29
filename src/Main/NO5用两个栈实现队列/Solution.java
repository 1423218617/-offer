package Main.NO5用两个栈实现队列;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack1.empty()){
            stack1.push(node);
        }else{
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            stack1.push(node);
        }
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }

    }

    public int pop() {
        return stack1.pop();
    }
}