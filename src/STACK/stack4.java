package STACK;

import java.util.Stack;

public class stack4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        //First in Last out
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println("First in Last out ");
        System.out.println("The peek is :"+stack.peek());
    }
}
