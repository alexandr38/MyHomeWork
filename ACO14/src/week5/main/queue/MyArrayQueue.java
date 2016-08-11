package week5.main.queue;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class MyArrayQueue<E> implements IMyQueue<E> {

    private E[] arrayQueue;
    private final int DEFAULT_CAPACITY = 5;
    private int front;
    private int rear;
    private int quantityElement;

    @Override
    public void insert(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E getFront() {
        return arrayQueue[front];
    }

    @Override
    public E getRear() {
        return arrayQueue[rear];
    }

    @Override
    public int getSize() {
        return quantityElement;
    }

    private boolean isEmpty() {
        return quantityElement == 0;
    }

    private boolean isFull() {
        return quantityElement == arrayQueue.length;
    }
}
