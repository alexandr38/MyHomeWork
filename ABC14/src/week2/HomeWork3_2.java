package week2;

/**
 * Created by Agryzkov on 08.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_2 {
    /* Given 2 arrays of ints, a and b, return true if they have the same first element
     or they have the same last element. Both arrays will be length 1 or more.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of array A " ) ;
        int lengthA = sc.nextInt() ;
        int [ ] arrayA = new int [ lengthA ];
        for ( int i = 0 ; i < lengthA ; i++ ) {
            System.out.println( " enter the array A element [ " + i + " ] ");
            arrayA [i] = sc.nextInt() ;
        }
        System.out.println(" enter the length of array B " ) ;
        int lengthB = sc.nextInt() ;
        int [ ] arrayB = new int [ lengthA ];
        for ( int i = 0 ; i < lengthB ; i++ ) {
            System.out.println( " enter the array B element [ " + i + " ] ");
            arrayB[i] = sc.nextInt() ;
        }
        boolean firstLastElement = arrayA[0] == arrayB[0] || arrayA[lengthA - 1] == arrayB[lengthB - 1] ;
        System.out.println( " first or last elements of arrays are equal - " + firstLastElement);
    }
}
