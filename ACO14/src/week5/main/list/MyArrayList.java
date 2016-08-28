package week5.main.list;

import java.util.List;

/**
 * Created by sasha on 28.08.2016.
 */
public class MyArrayList<E> implements IList<E> {

    private E[] elementData;
    private final int DEFAULT_CAPACITY = 5;
    private int size, capacity;

    public MyArrayList() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int capacity) {
        elementData = (E[]) new Object[capacity];
        size = 0;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public List<E> subList(int from, int to) {
        return null;
    }
}
