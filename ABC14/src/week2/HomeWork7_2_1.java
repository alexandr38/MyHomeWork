package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork7_2_1 {
    // inversion array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int sizeArray = sc.nextInt();
        int[] randomArray = MyArrayUtil.createIntArray( sizeArray );
        System.out.println( "parent array ");
        MyArrayUtil.printArray( randomArray, 0 );
        // inverse
        System.out.println( "inverse array " );
        MyArrayUtil.printArray( MyArrayUtil.inversArr( randomArray ), 0 );
    }
}
