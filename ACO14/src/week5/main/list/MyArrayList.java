package week5.main.list;


import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by sasha on 28.08.2016.
 */
public class MyArrayList<E> implements IMyList<E> {

    private E[] elementData;
    private final int DEFAULT_CAPACITY = 5;
    private int size;


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
        return indexOf(element) != -1 ? true : false;
    }

    @Override
    public Object[] toArray() {
        trimToSize();
        return elementData;
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
        if (index >= 0 && index < size){
            System.arraycopy(elementData, index, elementData, index + 1, size - index);
            elementData[index] = element;
            size++;
        } else {
            if (index == size) {
                elementData[size++] = element;
            }
        }
    }


    @Override
    public E get(int index) {
        if (!isIndex(index)) throw new IndexOutOfBoundsException("index out of bounds");
        return elementData[index];
    }

    @Override
    public void set(E element, int index) {
        if (isIndex(index)) {
            elementData[index] = element;
        }
    }

    @Override
    public void remove(E element) {
        remove(indexOf(element));
    }

    @Override
    public void remove(int index) {
        if (isIndex(index)) {
            if (size > 1 && index < size - 1) {
                System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
            }
            size--;
        }
    }

    @Override
    public int indexOf(E element) {
        int index = -1;

        if (!isEmpty()) {
            for (int i = 0; i < size && index == -1; i++){
                if (element.equals(elementData[i])) {
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public int lastIndexOff(E element) {
        int index = -1;

        if (!isEmpty()){
            for (int i = size - 1; i >= 0 && index == -1; i--){
                if (element.equals(elementData[i])){
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++){
                elementData[i] = null;
            }
            size = 0;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){

            int cursor = 0;

            @Override
            public boolean hasNext() {
                return !isEmpty() && cursor < size();
            }

            @Override
            public E next() {
                return elementData[cursor++];
            }
        };
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {

            int cursor = 0;
            int prevElem = -1;

            @Override
            public boolean hasNext() {
                return !isEmpty() && cursor < size();
            }

            @Override
            public E next() {
                prevElem++;
                return elementData[cursor++];
            }

            @Override
            public boolean hasPrevious() {
                return !isEmpty() && prevElem >= 0;
            }

            @Override
            public E previous() {
                cursor--;
                return elementData[prevElem--];
            }

            @Override
            public int nextIndex() {
                return cursor + 1;
            }

            @Override
            public int previousIndex() {
                return cursor - 1;
            }

            @Override
            public void remove() {
                remove();
                cursor = size - 1;
                prevElem = cursor - 1;
            }

            @Override
            public void set(E e) { elementData[cursor] = e; }

            @Override
            public void add(E e) {
                add(e);
                cursor = size - 1;
                prevElem = cursor - 1;
            }
        };
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public MyArrayList() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        elementData = (E[]) new Object[capacity];
        this.size = 0;
    }

    private void trimToSize(){
        if (!isEmpty() && size() < elementData.length) {
            E[] temp = (E[]) new Object[size()];
            System.arraycopy(elementData, 0, temp, 0, size);
            elementData = temp;
        }
    }

    private void resizeArray() {
        E[] temp = (E[]) new Object[elementData.length * 2];
        System.arraycopy(elementData, 0, temp, 0, elementData.length);
        elementData = temp;
    }

    private boolean isIndex(int index){
        return index >= 0 && index < size;
    }
}
