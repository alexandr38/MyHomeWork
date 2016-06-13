package week2;

/**
 * Created by sasha on 13.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_7 {

    public static void main(String[] args) {
        // random Size of Array
        int randomSize = (int) (Math.random() * 100 * 2 );
        // create array
        int[] randomArray = MyArrayUtil.createIntArray(randomSize);
        // print start array
        MyArrayUtil.printArray(randomArray, 0, randomSize );


    }
}
