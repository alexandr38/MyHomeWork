package week5.main.queue;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class MyArrayQueue<E> implements IMyQueue<E> {

    private E[] arrayQueue;
    private final int DEFAULT_CAPACITY = 5;
    private int front;
    private int rear;

    public MyArrayQueue() {
        E[] arrayQueue = (E[])(new Object[DEFAULT_CAPACITY]);
        front = rear = 0;
    }

    public MyArrayQueue(int capacity) {
        E[] arrayQueue = (E[])(new Object[capacity]);
        front = rear = 0;
    }

    @Override
    public void insert(E element) {
        if (isFull()) {
            expansCapacity();
        }
        if (front != 0 && rear == arrayQueue.length - 1) {
            shiftElement();
        }
        arrayQueue[rear] = element;
        rear++;
    }

    @Override
    public E remove() {
        E result = null;
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            result = arrayQueue[front];
            front ++;
        }
        return result;
    }

    @Override
    public E getFront() {
        return arrayQueue[front];
    }

    @Override
    public E getRear() {
        return arrayQueue[rear - 1];
    }

    @Override
    public int getSize() {
        return rear - front;
    }

    private boolean isEmpty() {
        return rear == front;
    }

    private boolean isFull() {
        return front == 0 && rear == arrayQueue.length;
    }

    private void expansCapacity(){
        E[] largQueue = (E[])(new Object[getSize() * 2]);
        System.arraycopy(arrayQueue, 0, largQueue, 0, arrayQueue.length);
        arrayQueue = largQueue;
    }

    private void shiftElement() {
        E[] arrTemp = (E[])(new Object[arrayQueue.length]);
        System.arraycopy(arrayQueue, front, arrTemp, 0, arrayQueue.length);
        arrayQueue = arrTemp;
        rear = rear - front;
        front = 0;
    }
}
