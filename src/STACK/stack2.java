package STACK;

import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String args[]){
        System.out.println("");
        System.out.println("This code is a Example for Stack DATA STRUCTURE");
        Stack<String> st = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String st1 = sc.nextLine();
        System.out.print("Enter your age:");
        String st2 = sc.nextLine();
        System.out.println("Enter your employment type:");
        String st3 = sc.nextLine();

        st.push(st1);
        st.push(st2);
        st.push(st3);
        System.out.println(st);
        System.out.println("Stack 1:"+st.peek());
        st.pop();
        System.out.println("Stack 2:"+st.peek());
        st.pop();
        System.out.println("Stack 3:"+st.peek());

    }
}
