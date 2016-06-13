package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

import java.util.Scanner;

public class MyArrayUtil {

    // create random array
    public  static  int[] createIntArray ( int sizeArray ) {

        int[] randomArray = new int[sizeArray] ;
        for (int i = 0 ; i < sizeArray ; i++ ) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        return randomArray ;
    }

    // search max cell
    public static int searchMaxCell ( int[] nums ) {

        int maxCell = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxCell < nums[i]) maxCell = nums[i];
        }
        return maxCell ;
    }

    // search min cell
    public static int searchMinCell ( int[] nums ) {

        int minCell = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ( minCell > nums[i] ) minCell = nums[i];
        }
        return minCell ;
    }

    // print array: 10 cell in string
    public static void printArray ( int[] nums ) {
        for ( int i = 0 ; i < nums.length ; i ++ ) {
            if ( (i+1)%10 == 0 ) System.out.println( nums[i] + "  " );
            else System.out.print ( nums[i] + "  " ) ;
        }
        System.out.println() ;
    }


}
