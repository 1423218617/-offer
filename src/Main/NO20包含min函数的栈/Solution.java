package Main.NO20包含min函数的栈;

import java.util.Stack;

/**
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void push(int node) {
        if(stack2.empty()){
            stack2.push(node);
        }
        if(node<stack2.peek()){
            stack2.push(node);
        }
        stack1.push(node);
    }
    public void pop() {
        if(stack1.pop()==stack2.peek()){
            stack2.pop();
        }
    }
    public int top() {
        return stack1.peek();
    }
    public int min() {
        return stack2.peek();
    }
}