package STACK;

import java.util.Stack;

public class Example5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3); //Last Out
        stack.push(5);
        stack.push(3);
        stack.push(14);
        stack.push(54);//First In

        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.push(4);//To insert a new Element into the stack data structure
        stack.pop();//Remove the first element in the Stack Data Structure
        stack.isEmpty();//Checks the stacks contains any values in the list;
        stack.peek();//Return the peek values that mean lastly added element into the stack
        stack.size();//It will return the total size of the stack data structure
        //It also , Works with the principle of Last in First out;
    }
}
