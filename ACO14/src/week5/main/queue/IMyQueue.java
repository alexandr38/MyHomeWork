package week5.main.queue;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public interface IMyQueue<E> {

    void insert(E element);

    E remove();

    E getFront();

    E getRear();

    int getSize();

    String toString();
}
