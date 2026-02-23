package STACK;

import java.util.Stack;

public class stack1 {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        //System.out.println(stack); //returns[]
        //Adding a element into a stack
        stack.push("Google");
        stack.push("Amazon");
        stack.push("Apple");
        stack.push("Microsoft");
        stack.push("Zoho");
        stack.push("Paytm");
        stack.push("TATA");
        System.out.println(stack);
        //Remove
        stack.pop();
        System.out.println(stack);
        System.out.println("-----------");
        stack.pop();
        stack.pop();
        for(String st:stack){

            System.out.println(st);
        }
        System.out.println("------------");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());//it's checks both empty or not empty
        System.out.println(stack.search("Apple"));
        System.out.println(stack.search("Google"));//Returns the index number;
        stack.pop();
        stack.pop();
        stack.pop();
        //LIFO = Last in First out; (Stack DataStructure)
        System.out.println(stack);

    }
}
