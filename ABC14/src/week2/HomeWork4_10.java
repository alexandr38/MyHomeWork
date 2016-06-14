package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_10 {
    // cut array from startPos to endPos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int sizeArray = sc.nextInt();
        System.out.println(" enter the start pos for cut of array ");
        int startPos = sc.nextInt();
        System.out.println(" enter the end pos for cut of array ");
        int endPos = sc.nextInt();
        // create new array
        int[] randomArray = MyArrayUtil.createIntArray( sizeArray );
        System.out.println( " parent array ");
        MyArrayUtil.printArray( randomArray, 0 );
        // cut array
        // int[] cutRandomArray = new int[endPos - startPos + 1] ;
        // System.arraycopy(randomArray, startPos, cutRandomArray, 0, cutRandomArray.length );
        int[] cutRandomArray = MyArrayUtil.splitArray( randomArray, startPos, endPos );
        System.out.println( " cut array ");
        MyArrayUtil.printArray( cutRandomArray, 0 );
    }
}
