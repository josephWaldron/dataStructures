package generics.Lab3;

import java.util.Stack; 
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> numbStack = new Stack<Integer>();
        System.out.println("Is numStack empty? " + numbStack.empty());
        numbStack.push(1);
        numbStack.push(2);
        numbStack.push(3);
        System.out.println("Peek numStack: " + numbStack.peek());
        System.out.println ("Int "+ numbStack.pop() + " was popped.");
        System.out.println("Peek numStack: " + numbStack.peek());
        int key = 2;
        System.out.println("The position of " + key + " is " + numbStack.search(key) + "\n");

        Stack<String> wordStack = new Stack<String>();
        System.out.println("Is wordStack empty? " + wordStack.empty());
        wordStack.push("One");
        wordStack.push("Two");
        wordStack.push("Three");
        System.out.println("Peek wordStack: " + wordStack.peek());
        System.out.println ("Word "+ wordStack.pop() + " was popped.");
        System.out.println("Peek wordStack: " + wordStack.peek());
        String key1 = "Two";
        System.out.println("The position of " + key1 + " is " + wordStack.search(key1));
    }
}
