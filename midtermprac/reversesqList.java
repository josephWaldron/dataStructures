package midtermprac;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class reversesqList {
    public static void main(String[] args) {
        final int CONSTANT = 5;
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < CONSTANT; i++) {
            q.add(i);
        }
        System.out.println("What is in q: ");
        q.forEach(i -> System.out.print(i));
        System.out.println("\nTop of q: ");
        System.out.println(q.peek());
        List<Integer> list1 = new LinkedList<Integer>();
        System.out.println("What is inside list: ");
        for (int i = 0; i < CONSTANT; i++) {
            list1.add(q.poll());
        }
        list1.forEach(i -> System.out.print(i));
        List<Integer> temp = new LinkedList<Integer>();
        for (int i = CONSTANT - 1; i >= 0; i--) {
            temp.add(list1.get(i));
        }
        System.out.println("\nWhat is in reversed temp list: ");
        temp.forEach(i -> System.out.print(i));

    }
}
