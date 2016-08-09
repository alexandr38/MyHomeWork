package week5.myArrayStack;

/**
 * Created by sasha on 07.08.2016.
 */
public class MyArrayStack {
    private int maxSize;
    private String[] stackArray;
    private int top = -1;

    public MyArrayStack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new String[maxSize];
        top = 0;
    }

    public void push(String str){
        if (!isFull()) {
            stackArray[++top] = str;
        } else System.out.println("stack is full");
    }

    public String pop(){
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("stack is empty");
            return null;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }


}
