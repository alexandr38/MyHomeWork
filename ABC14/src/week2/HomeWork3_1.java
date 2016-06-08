package week2;

/**
 * Created by Agryzkov on 08.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_1 {

    /* Given an array of ints, return true if 6 appears as either the first
    or last element in the array. The array will be length 1 or more.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of array elements " ) ;
        int numberArrElem = sc.nextInt() ;
        int[ ] arrayElem = new int [numberArrElem];
        for ( int i = 0 ; i < numberArrElem ; i++ ) {
            System.out.println( " enter the array element [" + i + " ] ");
            arrayElem [i] = sc.nextInt() ;
        }
        boolean resultSearchFirstLast6 = arrayElem[0] == 6 || arrayElem[numberArrElem -1] == 6 ;
        System.out.println( "the first or the last element of the array is equal to 6 - " + resultSearchFirstLast6 ) ;
    }
}
