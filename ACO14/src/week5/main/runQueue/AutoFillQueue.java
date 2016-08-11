package week5.main.runQueue;

import week5.main.queue.IMyQueue;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class AutoFillQueue {

    public static void autoFillQueue(IMyQueue queue,Object[] data) {
        for (int i = 0; i < data.length; i++) {
            queue.insert(data[i]);
        }
    }
}
