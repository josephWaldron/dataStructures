package generics.Lab3;

public class TestQueue {
  public static void main(String[] args) {
    java.util.Queue<String> queue = new java.util.LinkedList<>();
    queue.offer("Oklahoma");
    queue.offer("Indiana");
    queue.offer("Georgia");
    queue.offer("Texas");

    while (queue.size() > 0)
      System.out.print(queue.remove() + " ");

    java.util.Queue<Integer> numbQueue = new java.util.LinkedList<>();
    System.out.println("\nAdded " + numbQueue.add(1));
    System.out.println("Find head " + numbQueue.element());
    System.out.println("Offer " + numbQueue.offer(2));
    System.out.println("Peek " + numbQueue.peek());
    numbQueue.remove();
    numbQueue.remove();
    System.out.println("Poll " + numbQueue.poll()); //removes head, or returns null if head is empty
  }
}