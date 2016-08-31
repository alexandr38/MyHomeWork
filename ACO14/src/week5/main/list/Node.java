package week5.main.list;

/**
 * Created by sasha on 31.08.2016.
 */
public class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> prev;

    public Node(){};

    public Node(E value) {
        this.value = value;
    }

    public void setValue(E value){ this.value = value; }

    public E getValue() {return value;}

    public void setNext(Node<E> next) { this.next = next; }

    public Node<E> getNext() { return  next; }

    public void setPrev(Node<E> prev) { this.prev = prev; }

    public Node<E> getPrev() { return  prev; }
}
