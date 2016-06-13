package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

//swap max and min cell. If multiple items have the same value, remember the first occurrence
public class HomeWork4_2 {

    public static void main(String[] args) {
        // random Size of Array
        int randomSize = (int) (Math.random() * 100);
        // create array
        int[] randomArray = MyArrayUtil.createIntArray(randomSize);
        // print start array
        MyArrayUtil.printArray(randomArray);
        // swap min and max cell
        MyArrayUtil.swapMinMax(randomArray);
        //print result array
        MyArrayUtil.printArray(randomArray);
    }
}
