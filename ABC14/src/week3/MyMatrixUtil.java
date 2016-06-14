package week3;

/**
 * Created by Agryzkov on 14.06.2016.
 */
public class MyMatrixUtil {

    // create matrix
    public static int[] [] matrix ( int numStr, int numColumn ) {
        int[][] matrix = new int[numStr][numColumn];
        // cycle for string
        for ( int i = 0; i < numStr; i++ ) {
            // cycle for column
            for (int j = 0; j < numColumn; j++) {
                matrix[i][j] = (int)( Math.random()*100 );
            }
        }
        return matrix;
    }

    // print matrix
    public static void printMatrix ( int[][] matrix ) {
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //replace %5 -> 8
    public static int[][] replaceMatrix ( int[][] matrix ) {
        for ( int i = 0; i < matrix.length; i++ ) {
            for (int j = 0; j < matrix[i].length; j++ ) {
                if ( matrix[i][j]%5 == 0 ) { matrix[i][j] = 8; }
            }
        }
        return matrix;
    }

}
