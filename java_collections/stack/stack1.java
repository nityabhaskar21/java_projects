package java_collections.stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();
 
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Size: "+stack.size());
 
        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //EmptyStackException if stack is empty
        // System.out.println(stack.peek());   


    }
}
