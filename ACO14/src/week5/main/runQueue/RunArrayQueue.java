package week5.main.runQueue;

import week5.main.queue.IMyQueue;
import week5.main.queue.MyArrayQueue;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class RunArrayQueue {

    public static void main(String[] args) {

        // IMyQueue<String> queue = new MyArrayQueue<>();
        // String[] array = {"aa", "bb", "cc", "dd", "ee", "gg", "hh", "ii", "jj", "kk"};

        IMyQueue<Integer> queue = new MyArrayQueue<>();
        Integer[] array = {11, 12, 13, 14, 15, 16, 17};

        AutoFillQueue.autoFillQueue(queue, array);

        System.out.println(queue.toString());
        System.out.println("queue capasity = " + String.valueOf(queue.getSize()));

        System.out.println("remove element from queue:");
        System.out.println(String.valueOf(queue.remove()));

        System.out.println("queue after one remove");
        System.out.println(queue.toString());
        System.out.println("queue capasity = " + String.valueOf(queue.getSize()));

        System.out.println("front element");
        System.out.println(String.valueOf(queue.getFront()));

        System.out.println("rear element");
        System.out.println(String.valueOf(queue.getRear()));

    }
}
