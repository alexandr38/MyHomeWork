package week5.main.stack;

/**
 * Created by Agryzkov on 10.08.2016.
 */
public class MyLinkedStack<E> implements IMyStack<E> {

    private int capasity;
    private Node<E> top;

    public MyLinkedStack() {
        top = null;
        capasity = 0;
    }

    private boolean isEmpty() {
        return capasity == 0;
    }

    @Override
    public void push(E element) {
        Node<E> stack = new Node<E>(element);
        stack.setNext(top);
        top = stack;
        capasity++;
    }

    @Override
    public E pop() {
        E result = null;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            result = top.getValue();
            top = top.getNext();
            capasity--;
        }
        return result;
    }

    @Override
    public E peek() {
        E result = null;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            result = top.getValue();
        }
        return result;
    }

    @Override
    public Integer stackSize() {
        return capasity;
    }

    @Override
    public String toString(){
        String result = "";
        Node<E> current = top;

        while (current.getNext() != null){
            result += current.getValue().toString() + "\t";
        }
        return result;
    }
}
