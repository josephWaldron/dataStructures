package midtermprac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseq{
    public static void main(String[] args) {
        final int LENGTH = 5;
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println("What is in q: ");
        for (int i = 0; i < LENGTH; i++) {
            q.add(i);
        }
        q.forEach(i -> System.out.print(i + " ")); //print elements of q
        System.out.println("This is top of q: " + q.peek());

    }
}
