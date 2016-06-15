package week3;

import java.util.Scanner;

/**
 * Created by Agryzkov on 15.06.2016.
 */
public class HomeWork3_5 {
    // a) change min and max string; b) change min and max column
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
        System.out.println(" change min and max string ");
        MyMatrixUtil.printMatrix( MyMatrixUtil.changeStrMatr( ranMatrix ) );

    }
}
