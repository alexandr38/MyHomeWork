package week5.main.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/**
 * Created by sasha on 31.08.2016.
 */
public class MyLinkedList<E> implements IMyList<E> {

    private Node<E> top;
    private Node<E> tail;
    private int size;

    public MyLinkedList(){
        size = 0;
        top = tail = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public E[] toArray() {

        E[] list = (E[]) new Objects[size()];
        Node<E> temp = top;

        for (int i = 0; i < list.length; i++){
            list[i] = temp.getValue();
            temp = temp.getNext();
        }
        return list;
    }

    @Override
    public boolean add(E element) {
        Node<E> list = new Node<>(element);
        if (isEmpty()){
            top = tail = list;
        } else {
            tail.setNext(list);
            list.setPrev(tail);
            tail = list;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (isIndex(index)) {

            Node<E> addElem = new Node<>(element);
            Node<E> temp = top;

            for (int i = 0; i < index; i++){
                temp = temp.getNext();
            }
            addElem.setPrev(temp.getPrev());
            addElem.setNext(temp);
            temp.setPrev(addElem);
            size++;
        } else
            throw new IndexOutOfBoundsException("index out of bounds");
    }

    @Override
    public E get(int index) {
        if (isIndex(index)) {

            Node<E> temp = top;

            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getValue();
        } else
            throw new IndexOutOfBoundsException("index out of bounds");
    }

    @Override
    public void set(E element, int index) {
        if (isIndex(index)) {

            Node<E> temp = top;

            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            temp.setValue(element);
        } else
            throw new IndexOutOfBoundsException("index out of bounds");

    }

    @Override
    public void remove(E element) {
        if (!isEmpty()) {
            tail = tail.getPrev();
            tail.getNext().setPrev(null);
            tail.setNext(null);
            size--;
        }

    }

    @Override
    public void remove(int index) {
        if (isIndex(index)){

            Node<E> temp = top;

            for (int i = 0; i < index; i++){
                temp = temp.getNext();
            }
            temp.getPrev().setNext(temp.getNext());
            temp.getPrev().setPrev(temp.getNext());
            temp.setNext(null);
            temp.setPrev(null);
        }
    }

    @Override
    public int indexOf(E element) {

        int index = -1;
        Node<E> temp = top;

        for (int i = 0; i < size(); i++){
            if (element.equals(temp.getValue())){
                index = i;
            }
            temp = temp.getNext();
        }
        return index;
    }

    @Override
    public int lastIndexOff(E element) {

        int index = -1;
        Node<E> temp = tail;

        for (int i = size() - 1; i >= 0; i--){
            if (element.equals(temp.getValue())){
                index = i;
            }
            temp = temp.getPrev();
        }
        return index;
    }

    @Override // tak navernoe umiraet RAM?
    public void clear() {
        top = tail = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> cursor = top;

            @Override
            public boolean hasNext() {
                return cursor.getNext() != null;
            }

            @Override
            public E next() {
                cursor = cursor.getNext();
                return cursor.getPrev().getValue();
            }
        };
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {

            Node<E> cursor = top;
            int index = 0;

            @Override
            public boolean hasNext() {
                return cursor.getNext() != null;
            }

            @Override
            public E next() {
                cursor = cursor.getNext();
                index++;
                return cursor.getPrev().getValue();
            }

            @Override
            public boolean hasPrevious() {
                return cursor.getPrev() != null;
            }

            @Override
            public E previous() {
                cursor = cursor.getPrev();
                index--;
                return cursor.getNext().getValue();
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

    private boolean isIndex(int index){
        return !isEmpty() && index >= 0 && index < size;
    }
}
