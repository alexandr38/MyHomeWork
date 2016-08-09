package week5.main;

/**
 * Created by sasha on 09.08.2016.
 */
public interface IMyStack<E> {

    void  push(MyStack<E> element);

    MyStack<E> pop();

    MyStack<E> peek(int top);
}
