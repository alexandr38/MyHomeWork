package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

import java.util.Scanner;

// search and count user number in array
public class HomeWork4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number for search ");
        int userNumber = sc.nextInt();
        // random Size of Array
        int randomSize = (int) (Math.random() * 100);
        // create array
        int[] randomArray = MyArrayUtil.createIntArray(randomSize);
        // print start array
        MyArrayUtil.printArray(randomArray, 0, randomArray.length);
        // search user number
        System.out.println("quantity the number " + userNumber + " in array equally " + MyArrayUtil.countCell( randomArray, userNumber));
    }
}
