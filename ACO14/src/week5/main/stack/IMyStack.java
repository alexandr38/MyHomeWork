package week5.main.stack;

/**
 * Created by sasha on 09.08.2016.
 */
public interface IMyStack<E> {

    void  push(E element);

    E pop();

    E peek();

    Integer stackSize();


    String toString ();
}
