package week5.main.stack;

/**
 * Created by sasha on 10.08.2016.
 */
public class Node<E> {

    private E value;
    private Node<E> next;

    public Node(){};

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {return value;}

    public void setNext(Node<E> next) { this.next = next; }

    public Node<E> getNext() { return  next; }




}
