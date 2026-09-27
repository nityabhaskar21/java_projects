package java_collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();


        //Push
        stack.push("String1");
        stack.push("String2");
        stack.push("String3");
        stack.push("String4");

        //Peek
        System.out.println("The top of stack: "+ stack.peek()); //The top of stack: String4


        //Pop
        stack.pop();


        System.out.println("The new top of stack: "+ stack.peek()); //The new top of stack: String3
        

    }
}
