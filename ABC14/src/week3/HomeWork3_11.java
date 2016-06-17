package week3;

import java.util.Scanner;

/**
 * Created by Agryzkov on 17.06.2016.
 */
public class HomeWork3_11 {
    // rotate matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of matrix (string = column (i = j)) ");
        int matrSize = sc.nextInt();
        System.out.println( " enter rotation angle multiple 90 " );
        int angle = sc.nextInt();
        int[][] matrix = MyMatrixUtil.matrix( matrSize, matrSize );
                //{ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };
        System.out.println( " parent matrix " );
        MyMatrixUtil.printMatrix( matrix );
        //rotate
        System.out.println();
        MyMatrixUtil.printMatrix( MyMatrixUtil.rotationMatrix( matrix, angle ));
    }

}
