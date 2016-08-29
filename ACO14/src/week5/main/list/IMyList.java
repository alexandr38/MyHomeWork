package week5.main.list;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Agryzkov on 29.08.2016.
 */
// http://javatalks.ru/topics/45327?page=1#232369
// http://javist.ru/svyazannyj-spisok-realizacii-v-java/
// http://www.sql.ru/forum/710113/realizaciya-iterator

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
