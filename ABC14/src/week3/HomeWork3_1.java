package week3;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_1 {
    // create matrix. cell=%5 -> 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of string ");
        int numStr = sc.nextInt();
        System.out.println(" enter the number of column ");
        int numCol = sc.nextInt();
        // create matrix
        int[][] ranMatrix = MyMatrixUtil.matrix( numStr, numCol );
        // print matrix
        MyMatrixUtil.printMatrix( ranMatrix );
    }
}
