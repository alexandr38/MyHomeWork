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

    // print array: 20 cell in string
    public static void printArray ( int[] nums, int pos, int size ) {
        for ( int i = pos ; i < size ; i ++ ) {
            if ( (i+1)%20 == 0 ) System.out.println( nums[i] + "  " );
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

    // create new odd array ( нечетные элементы)
    public static int[] newOddArray ( int sizeNums ) {
        int[] oddArray = new int[sizeNums] ;
        for ( int i = 0 ; i < sizeNums ; i++ ) {
            oddArray[i] = (int)(Math.random()*100)*2 + 1;
        }
        return oddArray ;
    }

    // create new even array ( четные элементы)
    public static int[] newEvenArray ( int sizeNums ) {
        int[] evenArray = new int[sizeNums] ;
        for ( int i = 0 ; i < sizeNums ; i++ ) {
            evenArray[i] = (int)(Math.random()*100)*2;
        }
        return evenArray ;
    }

}
