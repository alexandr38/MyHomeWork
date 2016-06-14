package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_9 {
    /* two arrays of random numbers from 25 to 75.
    Identify in which of the array elements even more.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum = 25;
        int maxNum = 75;

        System.out.println(" enter the size of array ");
        int sizeArray = sc.nextInt();
        // create array
        int[] firstArray = MyArrayUtil.minMaxCellArr( minNum, maxNum, sizeArray ) ;
        int[] secondArray = MyArrayUtil.minMaxCellArr( minNum, maxNum, sizeArray ) ;
        System.out.println( "first array " );
        MyArrayUtil.printArray( firstArray, 0 );
        System.out.println( "second array " );
        MyArrayUtil.printArray( secondArray, 0 );
        // count even number in array
        int evenFirstArray = MyArrayUtil.evenCount( firstArray );
        int evenSecondArray = MyArrayUtil.evenCount( secondArray);
        if ( evenFirstArray > evenSecondArray ) { System.out.println( "in the first array even elements more then the second array : " + evenFirstArray );}
        else {
            if (evenFirstArray < evenSecondArray) {
                System.out.println("in the second array even elements more then the first array : " + evenSecondArray);
            } else {
                System.out.println("the even elements in both arrays are equals: " + evenFirstArray + " = " + evenSecondArray);
            }
        }
    }
}
