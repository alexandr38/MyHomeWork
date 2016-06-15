package week3;

import week2.MyArrayUtil;
import java.util.Scanner;

/**
 * Created by Agryzkov on 15.06.2016.
 */
public class HomeWork3_4 {

    // diagonal of matrix save in to array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of string ");
        int numStr = sc.nextInt();
        System.out.println(" enter the number of column ");
        int numCol = sc.nextInt();
        // create matrix
        int[][] ranMatrix = MyMatrixUtil.matrix(numStr, numCol);
        // print matrix
        System.out.println(" parent matrix ");
        MyMatrixUtil.printMatrix(ranMatrix);
        int[] diagonArr = MyMatrixUtil.diagonArr( ranMatrix );
        System.out.println( " result array " );
        MyArrayUtil.printArray( diagonArr, 0 );
    }
}
