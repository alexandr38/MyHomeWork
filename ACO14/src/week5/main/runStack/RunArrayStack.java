package week5.main.runStack;

import week5.main.stack.IMyStack;
import week5.main.stack.MyArrayStack;

/**
 * Created by sasha on 10.08.2016.
 */
public class RunArrayStack {
    public static void main(String[] args) {

       // IMyStack<String> stack = new MyArrayStack<>();
       // String[] array = {"aa", "bb", "cc", "dd", "ee", "gg", "hh", "ii", "jj", "kk"};

        IMyStack<Integer> stack = new MyArrayStack<>();
        Integer[] array = {11, 12, 13, 14, 15, 16, 17};

        AutoFillStack.autoFillStack(stack, array);

        System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

        System.out.println("pop element from stack:");
        System.out.println(String.valueOf(stack.pop()));

        System.out.println("stack after one pop");
        System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

    }

}
