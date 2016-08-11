package week5.main.queue;

import week5.main.stack.Node;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class MyLinkedQueue<E> implements IMyQueue<E> {

    private int capacity;
    private Node<E> front, rear;

    public MyLinkedQueue() {
        front = rear = null;
        capacity = 0;
    }

    public Boolean isEmpty() {
        return capacity == 0;
    }

    @Override
    public void insert(E element) {
        Node<E> node = new Node<E>(element);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
        capacity++;
    }

    @Override
    public E remove() {
        E result = null;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            result = front.getValue();
            front = front.getNext();
            capacity--;
        }
        return result;
    }

    @Override
    public E getFront() {
        E result = null;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            result = front.getValue();
        }
        return result;
    }

    @Override
    public E getRear() {
        E result = null;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            result = rear.getValue();
        }
        return result;
    }

    @Override
    public int getSize() {
        return capacity;
    }

    @Override
    public String toString(){
        String result = "";
        Node<E> current = front;

        while (current != null){
            result += String.valueOf(current.getValue()) + "\t";
            current = current.getNext();
        }
        return result;
    }
}
