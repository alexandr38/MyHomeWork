package week5.main.list;

import java.util.List;

/**
 * Created by sasha on 28.08.2016.
 */
public interface IList<E> {

    int size();

    boolean isEmpty();

    boolean add (E element);

    boolean contains(E element);

    boolean remove (E element);

    void clear();

    void add (int index, E element);

    E get (int index);

    E set (int index, E element);

    void remove (int index);

    int indexOf (E element);

    int lastIndexOf (E element);

    List<E> subList(int from, int to);





}
