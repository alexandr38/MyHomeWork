package week3;
/**
 * Created by sasha on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork3_2 {
    // create boolean matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of string ");
        int numStr = sc.nextInt();
        System.out.println(" enter the number of column ");
        int numCol = sc.nextInt();
        boolean[][] matrix = MyMatrixUtil.boolMatrix(numStr, numCol);
        MyMatrixUtil.boolPrintMatrix(matrix);
    }
}
