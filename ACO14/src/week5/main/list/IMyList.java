package week5.main.list;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Agryzkov on 29.08.2016.
 */

public interface IMyList<E> {

    int size();

    boolean isEmpty();

    boolean contains(E element);

    Object[] toArray();

    boolean add(E element);

    void add(int index, E element);

    E get(int index);

    void set (E element, int index);

    void remove (E element);

    void remove (int index);

    int indexOf (E element);

    int lastIndexOff (E element);

    void clear();

    Iterator<E> iterator();

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int index);

}
