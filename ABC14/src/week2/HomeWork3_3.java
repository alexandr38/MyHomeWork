package week2;

/**
 * Created by Agryzkov on 08.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_3 {

    /* Given an array of ints length 3, return a new array with the elements
     in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [ ] arrayElem = new int [ 3 ];
        System.out.println(" enter an array of three elements " ) ;
        for ( int i = 0 ; i < arrayElem.length ; i++ ) {
            System.out.println( " enter the array element [" + i + "] ");
            arrayElem [ i ] = sc.nextInt() ;
        }
        System.out.println( " source array " ) ;
        for ( int i = 0 ; i < arrayElem.length ; i++ ) {
            System.out.println ( arrayElem [i] ) ;
        }
        int buff = arrayElem [ 0 ] ;
        arrayElem [ 0 ] = arrayElem [ arrayElem.length - 1 ] ;
        arrayElem [ arrayElem.length - 1 ] = buff ;

        System.out.println( " array inversion " ) ;
        for ( int i = 0 ; i < arrayElem.length ; i++ ) {
            System.out.println ( arrayElem [i] ) ;
        }
    }
}
