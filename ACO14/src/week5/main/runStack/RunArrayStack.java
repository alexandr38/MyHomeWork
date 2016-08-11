package week5.main.runStack;

import week5.main.stack.IMyStack;
import week5.main.stack.MyArrayStack;

/**
 * Created by sasha on 10.08.2016.
 */
public class RunArrayStack {
    public static void main(String[] args) {

        IMyStack<String> stack = createArrayStack();

        System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

        System.out.println("pop element from stack:");
        System.out.println(String.valueOf(stack.pop()));

        System.out.println("stack after one pop");
        System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

    }

    public static IMyStack<String> createArrayStack(){

        String[] array = {"aa", "bb", "cc", "dd", "ee", "gg", "hh", "ii", "jj", "kk"};

        IMyStack<String> stack = new MyArrayStack<>();

        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        return stack;
    }
}
