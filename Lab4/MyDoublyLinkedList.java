package Lab4;
import java.util.Iterator;
public class MyDoublyLinkedList<E> implements MyList<E> {
    private Node<E> head, tail;
    private int size;

    //Create an empty list
    public MyDoublyLinkedList(){

    }

    //Create a list from an array of objects
    public MyDoublyLinkedList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    //Return the head element in the list
    public E getFirst(){
        if(size == 0){
            return null;
        }
        else{
            return head.element;
        }    
    }
    //Return the last element in the list
    public E getLast(){
        if(size == 0){
            return null;
        }
        else{
            return tail.element;
        }
    }
    // Add an element to the beginning of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size
        if (tail == null) // the new node is the only node in list
            tail = head;
        if (head != tail) // For a doubly linked list only
            head.next.previous = head; // For a doubly linked list only
    }
    // Add a new element at the specified index
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        }
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
            current = current.next;
            }
        Node<E> temp = current.next;
        current.next = new Node<>(e);
        (current.next).next = temp;
        size++;
        temp.previous = current.next;// For a doubly linked list only
        current.next.previous = current;// For a doubly linked list only
        }
    }
    // Add an element to the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        Node<E> temp = tail;
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    size++;
    tail.previous = temp; //For a doubly linked list only
    }

    // Remove the last node
    public E removeLast() {
        if (size == 0) {
            return null;
        }
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    // toString() method
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
                result.append(current.element);
                current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            }
            else {
                result.append("]"); // Insert the closing ] in the string
            }
        }
        return result.toString();
    }
   
    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;
        public Node(E o) {
            element = o;
        }
    }
    public int size() {
   // Actual implementation is left for practice
        return 0;
    }
    public boolean contains(Object o) {
   // Actual implementation is left for practice
        return false;
    }
    public Iterator<E> iterator() {
   // Actual implementation is left for practice
        return null;
    }
   public void clear() {
    // Actual implementation is left for practice
    }
    public E get(int index) {
    // Actual implementation is left for practice
        return null;
    }
    public int indexOf(Object e) {
    // Actual implementation is left for practice
        return 0;
    }
    public int lastIndexOf(E e) {
    // Actual implementation is left for practice
        return 0;
    }
    public E remove(int index) {
    // Actual implementation is left for practice
        return null;
    }
    public E set(int index, E e) {
    // Actual implementation is left for practice
        return null;
    }
    public static void main(String[] args) {
        long begin, end, time;
        long timeAvgSum=0;
        long timeAvgSum2=0;
        long timeAvgSum3=0;
        // Create a list
        var myDoublyLinkedList = new MyDoublyLinkedList<Integer>();
        //add 4 elements
        for (int i = 1; i < 5; i++) {
            begin = System.nanoTime();
            myDoublyLinkedList.add(i);
            end = System.nanoTime();
            time = (end - begin)/4;
            System.out.println("It took: " + time + " nanoseconds ");
            System.out.println("Initial list: " + myDoublyLinkedList + ", head element: " + myDoublyLinkedList.head.element +
            ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myDoublyLinkedList.tail.element +
            ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myDoublyLinkedList.size + "\n");
            timeAvgSum = time + timeAvgSum ;
            
    
        }
        System.out.println("\nThe average amount of time it takes to add one element 4 times is : " + timeAvgSum/4);
       
        //add 4 more in front of the list
        for (int i = 1; i < 5; i++) {
            begin = System.nanoTime();
            myDoublyLinkedList.add(10+i);
            end = System.nanoTime();
            time = (end - begin) / 4;
            System.out.println("It took: " + time + " nanoseconds ");
            System.out.println("List after modification: " + myDoublyLinkedList +
            ", head element: " + myDoublyLinkedList.head.element +
            ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myDoublyLinkedList.tail.element +
            ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myDoublyLinkedList.size + "\n");
            timeAvgSum2 =timeAvgSum2+ time;
        }
        System.out.println("\nThe average time it takes to add first 4 times is: " + timeAvgSum2/4);
        //remove 3 last elements
        for (int i = 0; i < 3; i++) {
            begin = System.nanoTime();
            myDoublyLinkedList.removeLast();
            end = System.nanoTime();
            time = (end - begin) / 4;
            System.out.println("It took: " + time + " nanoseconds ");
            System.out.println("List after removal: " + myDoublyLinkedList +
            ", head element: " + myDoublyLinkedList.head.element +
            ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myDoublyLinkedList.tail.element +
            ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myDoublyLinkedList.size + "\n"); 
            timeAvgSum3 = timeAvgSum3 + time;
        }
        System.out.println("\nThe average time it takes to remove elements 3 time is " + timeAvgSum3/3);
    }
}