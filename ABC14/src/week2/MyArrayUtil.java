package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

import javax.xml.stream.events.StartDocument;
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

    // print array: 20 cell in string
    public static void printArray ( int[] nums, int pos ) {
        for ( int i = pos, elemInStr = 1 ; i < nums.length ; i ++ , elemInStr++ ) {
            if ( elemInStr == 20 ) { System.out.println( nums[i] + "  " );
                                     elemInStr = 0 ; }
            else System.out.print ( nums[i] + "  " ) ;
        }
        System.out.println() ;
    }

    //swap max and min cell. If multiple items have the same value, remember the first occurrence
    public static int[] swapMinMax ( int[] nums ) {
        int maxCell = nums[0] ;
        int indexMaxCell = 0 ;
        int minCell = nums[0] ;
        int indexMinCell = 0 ;
        // search first min and first max cell
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > maxCell ) { maxCell = nums[i]; indexMaxCell = i; }
            if (nums[i] < minCell ) { minCell = nums[i]; indexMinCell = i; }
        }
        // swap cell
        int buff = maxCell ;
        nums[indexMaxCell] = minCell ;
        nums[indexMinCell] = buff ;
        return nums ;
    }

    // search cell and count
    public static int countCell ( int[] nums , int searchNum ) {
        int searchNumCount = 0 ;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] == searchNum ) searchNumCount++ ;
        }
        return searchNumCount ;
    }

    // FAQ arithmetic mean value of the array
    public static float sumArray ( int[] nums, int pos, int count ) {
        float sumArr = 0 ;
        for ( int i = pos ; i < pos + count ; i++ ) {
        sumArr += nums[i] ;
        }
        sumArr /= count ;
        return sumArr ;
    }

    // create array, where min Value <= cell <= max Value
    public static int[] minMaxCellArr (int minCell, int maxCell, int size ) {
        int[] minMaxCellArr = new int[size] ;
        for ( int i = 0 ; i < size ; i++ ) {
            minMaxCellArr[i] = minCell + (int)(Math.random() * (maxCell - minCell + 1 )) ;
        }
        return minMaxCellArr ;
    }

    // count of even numbers
    public static int evenCount ( int[] nums ) {
        int evenCount = 0 ;
        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[i]%2 == 0) { evenCount++ ; }
        }
        return evenCount ;
    }

    // cut array from startPos to endPos
    public static int[] splitArray ( int[] arr, int start, int end ) {
        // control endPos
        if ( end > arr.length - 1 ) {end = arr.length - 1; }
        int[] cutArray = new int[end - start + 1];
        for ( int i = 0; i < cutArray.length; i++, start++ ) {
            cutArray[i] = arr[start];
        }
        return cutArray;
    }
}
