package Lab4;

import java.util.Stack;

public class ReversedStack {
   public static <E extends Comparable<E>> Stack<E> reversedStack(Stack <E> stack){
       Stack<E> temp = new Stack<>();

       while(!stack.isEmpty())//push all elements to temp stack
        temp.push(stack.pop());
    return temp;
   }
   public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       System.out.println("Initial stack bottom to top: " + s);
       s = reversedStack(s);
       System.out.println("Stack after calling the method: " + s);
   }
}
