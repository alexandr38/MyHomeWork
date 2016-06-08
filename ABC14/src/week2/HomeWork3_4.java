package week2;

/**
 * Created by Agryzkov on 08.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_4 {

    /* Given 2 int arrays, a and b, each length 3,
    return a new array length 2 containing their middle elements
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [ ] arrayAElem = new int [ 3 ];
        System.out.println(" enter an array A of three elements " ) ;
        for ( int i = 0 ; i < arrayAElem.length ; i++ ) {
            System.out.println(" enter the array A element [" + i + "] ");
            arrayAElem[i] = sc.nextInt();
        }
         int [ ] arrayBElem = new int [ 3 ];
         System.out.println(" enter an array B of three elements " ) ;
         for ( int i = 0 ; i < arrayBElem.length ; i++ ) {
             System.out.println(" enter the array B element [" + i + "] ");
             arrayBElem[i] = sc.nextInt();
         }

    }
}
