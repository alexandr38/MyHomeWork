package week5.main.stack;

/**
 * Created by sasha on 09.08.2016.
 */
public class MyArrayStack<E> implements IMyStack<E> {

    private final int DEFAULT_CAPACITY = 5;
    private int top;
    private E[] arrayStack;

    public MyArrayStack(){
        top = 0;
        arrayStack = (E[])(new Object[DEFAULT_CAPACITY]);
    }

    public MyArrayStack(int startCapacity){
        top = 0;
        arrayStack = (E[])(new Object[startCapacity]);
    }

    private void expansCapacity(){
        E[] largStack = (E[])(new Object[stackSize() * 2]);
        System.arraycopy(arrayStack, 0, largStack, 0, stackSize());
        arrayStack = largStack;
    }

    private boolean isEmpty(){
        return top == 0;
    }

    private boolean isFull(){
        return arrayStack.length == stackSize();
    }

    @Override
    public void push(E element) {
        if (isFull()){
            expansCapacity();
        }
        arrayStack[top] = element;
        top++;
    }

    @Override
    public E pop() {
        E result = null;
        if (!isEmpty()){
            result = arrayStack[top - 1];
            arrayStack[top - 1] = null;
            top--;
        }else {
            System.out.println("stack is empty");
        }
        return result;
    }

    @Override
    public E peek() {
        E result = null;
        if (!isEmpty()){
            result = arrayStack[top - 1];
            } else {
            System.out.println("stack is empty or index outside of stack");
        }
        return result;
    }

    @Override
    public Integer stackSize() {
        return top;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = top - 1; i >= 0; i--){
            str+=String.valueOf(arrayStack[i]) + "\t";
        }
        return str;
    }
}
