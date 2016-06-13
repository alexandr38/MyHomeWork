package week2;

/**
 * Created by sasha on 13.06.2016.
 */

import java.util.Scanner;

// среднее арифметическое массива
public class HomeWork4_6 {

    public static void main(String[] args) {
        // random Size of Array
        int randomSize = (int) (Math.random() * 100);
        // create array
        int[] randomArray = MyArrayUtil.createIntArray(randomSize);
        // print start array
        MyArrayUtil.printArray(randomArray, 0, randomArray.length);
        System.out.println(" FAQ arithmetic mean value of the array = " + MyArrayUtil.sumArray(randomArray, 0, randomArray.length));
    }
}
