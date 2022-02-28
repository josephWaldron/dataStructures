package Lab4;

import java.util.Stack;

public class ReversedStack {
   public static <E extends Comparable<E>> Stack<E> reversedStack(Stack <E> stack){
       Stack<E> temp = new Stack<>();

       while(!stack.isEmpty())//push all elements to temp stack
        temp.push(stack.pop());
    return temp;
   }

   static Stack<Integer> st = new Stack<>();
     
    // Below is a recursive function
    // that inserts an element
    // at the bottom of a stack.
    static void insert_at_bottom(int x)
    {
 
        if(st.isEmpty())
            st.push(x);
 
        else
        {
             
            // All items are held in Function
            // Call Stack until we reach end
            // of the stack. When the stack becomes
            // empty, the st.size() becomes 0, the
            // above if part is executed and
            // the item is inserted at the bottom
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
 
            // push allthe items held
            // in Function Call Stack
            // once the item is inserted
            // at the bottom
            st.push(a);
        }
    }
     
    // Below is the function that
    // reverses the given stack using
    // insert_at_bottom()
    static void reverseRecursive()
    {
        if(st.size() > 0)
        {
             
            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack
            int x = st.peek();
            st.pop();
            reverseRecursive();
             
            // Insert all the items held
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom
            insert_at_bottom(x);
        }
    }
   public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       long begin, end, time;
        int many = 10000000;
       begin = System.nanoTime();
       for(int i = 0; i <= many; i++){
           s.push(i);
        //    System.out.println("Initial stack bottom to top: " + s);
           s = reversedStack(s);
        //    System.out.println("Stack after calling the method: " + s);
       }
       end = System.nanoTime();
       time = (end - begin);
       System.out.println("It took " + time + " nanoseconds to reverse " + many + " elements");
       begin = System.nanoTime();
       for(int i = 0; i <= many; i++){
        st.push(i);
        // System.out.println("Initial recursive stack bottom to top: " + st);
        }
        reverseRecursive();
        // System.out.println("Recursive stack after calling the method: " + st);
        end = System.nanoTime();
       time = (end - begin);
       System.out.println("It took " + time + " nanoseconds to reverse " + many + " elements");
        }
}
