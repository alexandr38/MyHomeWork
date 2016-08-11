package week5.main.runStack;

import week5.main.stack.IMyStack;

/**
 * Created by Agryzkov on 11.08.2016.
 */
public class AutoFillStack {

    public static void autoFillStack(IMyStack stack,String[] data) {
        for (int i = 0; i < data.length; i++) {
            stack.push(data[i]);
        }
    }
}
