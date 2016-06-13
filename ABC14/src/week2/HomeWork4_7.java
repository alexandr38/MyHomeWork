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
        MyArrayUtil.printArray(randomArray, 0 );
        // half the sum of an array
        float sumFirstHalfArr = MyArrayUtil.sumArray( randomArray, 0, randomArray.length/2 ) ;
        float sumSecondHalfArr = MyArrayUtil.sumArray( randomArray, randomArray.length/2, randomArray.length/2 ) ;
        if ( sumFirstHalfArr > sumSecondHalfArr ) { MyArrayUtil.printArray( randomArray, 0 );}
        else {if ( sumFirstHalfArr < sumSecondHalfArr )
                { MyArrayUtil.printArray( randomArray, randomArray.length/2 );}
             }
    }
}
