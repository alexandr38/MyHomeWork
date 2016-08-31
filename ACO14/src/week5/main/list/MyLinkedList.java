package week5.main.list;

import java.util.Iterator;
import java.util.ListIterator;

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
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
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

    }

    @Override
    public void remove(int index) {

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

    @Override // tak navernoe umiraet pamyat?
    public void clear() {
        top = tail = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    private boolean isIndex(int index){
        return !isEmpty() && index >= 0 && index < size;
    }
}
