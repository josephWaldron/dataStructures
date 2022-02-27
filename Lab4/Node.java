package Lab4;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> previous; //new pointer

    public Node(E o){
        element = o;
    }
}
