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
        top = --maxSize;
    }

    public void push(String str){
        stackArray[++top] = str;
    }

    public String pop(){
        return stackArray[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    
}
