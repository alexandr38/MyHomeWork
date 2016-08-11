package week5.main.runStack;

import week5.main.stack.IMyStack;
import week5.main.stack.MyLinkedStack;

/**
 * Created by sasha on 10.08.2016.
 */
public class RunLinkedStack {

    public static void main(String[] args) {

        IMyStack<String> stack = createLinkedStack();

        System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

        System.out.println("pop element from stack:");
        System.out.println(String.valueOf(stack.pop()));

        System.out.println("stack after one pop");
        //System.out.println(stack.toString());
        System.out.println("stack capasity = " + String.valueOf(stack.stackSize()));

    }

    public static IMyStack<String> createLinkedStack() {
        IMyStack<String> stack = new MyLinkedStack<String>();

        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        stack.push("dd");
        stack.push("ee");
        stack.push("ff");
        stack.push("gg");
        stack.push("hh");
        stack.push("ii");
        stack.push("jj");
        return stack;
    }
}
