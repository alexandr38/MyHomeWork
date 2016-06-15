package week3;

import java.util.Scanner;

/**
 * Created by Agryzkov on 15.06.2016.
 */
public class HomeWork3_9 {
    // matrixA * matrixB
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of string matrix A ");
        int numStrA = sc.nextInt();
        System.out.println(" enter the number of column (string B) matrix A ");
        int numColAstrB = sc.nextInt();
        System.out.println(" enter the number of column matrix B ");
        int numColB = sc.nextInt();
        // create matrix
        int[][] matrixA = MyMatrixUtil.matrix( numStrA, numColAstrB );
        int[][] matrixB = MyMatrixUtil.matrix( numColAstrB, numColB );
        // print matrix
        System.out.println( " parent matrix " );
        MyMatrixUtil.printMatrix( matrixA );
        System.out.println();
        MyMatrixUtil.printMatrix( matrixB );
        // multipli A*B
        int[][] multiAB = MyMatrixUtil.multipliMatrix( matrixA, matrixB );
        System.out.println( " multipli matrix " );
        MyMatrixUtil.printMatrix( multiAB );
    }
}
