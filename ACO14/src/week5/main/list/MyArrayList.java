package week5.main.list;


import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by sasha on 28.08.2016.
 */
public class MyArrayList<E> implements IMyList<E> {

    private E[] elementData;
    private final int DEFAULT_CAPACITY = 5;
    private int size, index;


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E element) {
        if (size + 1 > elementData.length){
            resizeArray();
        }
        elementData[size++] = element;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (size + 1 > elementData.length){
            resizeArray();
        }

        E[] temp = (E[]) new Object[elementData.length];

        if (index == 0){
            temp[0] = element;
            System.arraycopy(elementData, 0, temp, 1, size);
            } else {
                if (index == size) {
                    temp[size] = element;
                    System.arraycopy(elementData, 0, temp, 0, size);
                } else {
                    System.arraycopy(elementData, 0, temp, 0, index - 1);
                    temp[index - 1] = element;
                    System.arraycopy(elementData, index - 1, temp, index, size - index + 1);
                }
        }
        elementData = temp;
        size++;
    }

    @Override
    public E get(int index) {
        return elementData[index - 1];
    }

    @Override
    public void set(E element, int index) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOff(E element) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public E previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        };
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public MyArrayList() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
        this.index = this.size = 0;
    }

    public MyArrayList(int capacity) {
        elementData = (E[]) new Object[capacity];
        this.index = this.size = 0;
    }

    private void resizeArray() {
        E[] temp = (E[]) new Object[elementData.length * 2 / 3 - 1];
        System.arraycopy(elementData, 0, temp, 0, elementData.length);
        elementData = temp;
    }
}
