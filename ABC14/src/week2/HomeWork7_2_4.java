package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork7_2_4 {
    // right shift for n pos
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int sizeArray = sc.nextInt();
        System.out.println(" enter the number for right shift ");
        int numRightShift = sc.nextInt();
        int[] nums = MyArrayUtil.createIntArray( sizeArray );
        System.out.println( " parent array ");
        System.out.println( nums );
        // right shift
        System.out.println( MyArrayUtil.rightShift( nums, numRightShift ) );
    }
}
