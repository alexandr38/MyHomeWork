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
                System.out.format( "%6d", matrix[i][j] );
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

    // create boolean matrix
    public static boolean[][] boolMatrix ( int strNum, int columnNum ) {
        boolean[][] boolMatrix = new boolean[strNum][columnNum];
        for ( int i = 0; i < strNum; i++ ) {
            for ( int j = 0; j < columnNum; j++ ) {
                if ( i == j ) { boolMatrix[i][j] = true; }
                else { boolMatrix[i][j] = false; }
            }
        }
        return boolMatrix;
    }

    // print boolean matrix
    public static void boolPrintMatrix ( boolean[][] matrix ) {
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // diagonal of matrix save in to array
    public static int[] diagonArr ( int[][] matrix ) {
        int[] diagArr = new int[matrix.length];
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++ ) {
                if ( i == j ) { diagArr[i] = matrix[i][j]; }
            }
        }
        return diagArr;
    }

    // change max and min string of matrix ( max and min - summ elements of string )
    public static int[][] changeStrMatr( int[][] matrix ) {
        // array of sums of elements rows
        int[] sumArr = new int[matrix.length];
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++ ) {
                sumArr[i] += matrix[i][j];
            }
        }
        // search max and min sum and their index
        int maxSum = sumArr[0];
        int indexMaxSum = 0;
        int minSum = sumArr[0];
        int indexMinSum = 0;
        for ( int i = 0; i < sumArr.length; i++ ) {
            if ( sumArr[i] > maxSum ) { maxSum = sumArr[i]; indexMaxSum = i; }
            if ( sumArr[i] < minSum ) { minSum = sumArr[i]; indexMinSum = i; }
        }
        // change rows
        switch ( indexMaxSum - indexMinSum ) {
            case 0 :
                break;
            default :
                for ( int j = 0; j < matrix[indexMaxSum].length; j++ ) {
                    int buf = matrix[indexMaxSum][j];
                    matrix[indexMaxSum][j] = matrix[indexMinSum][j];
                    matrix[indexMinSum][j] = buf;
                }
        }
        return matrix;
    }

    // change max and min column of matrix ( max and min - summ elements of column )
    public static int[][] changeColumnMatr( int[][] matrix ) {
        // array of sums of elements columns
        int[] sumArr = new int[matrix[0].length];
        // circle for columns
        for ( int j = 0; j < matrix[0].length; j++ ) {
            // circle for rows
            for ( int i = 0; i < matrix.length; i++ ) {
                sumArr[j] += matrix[i][j];
            }
        }
        // search max and min sum and their index
        int maxSum = sumArr[0];
        int indexMaxSum = 0;
        int minSum = sumArr[0];
        int indexMinSum = 0;
        for ( int i = 0; i < sumArr.length; i++ ) {
            if ( sumArr[i] > maxSum ) { maxSum = sumArr[i]; indexMaxSum = i; }
            if ( sumArr[i] < minSum ) { minSum = sumArr[i]; indexMinSum = i; }
        }
        // change columns
        switch ( indexMaxSum - indexMinSum ) {
            case 0 :
                break;
            default :
                for ( int i = 0; i < matrix.length; i++ ) {
                    int buf = matrix[i][indexMaxSum];
                    matrix[i][indexMaxSum] = matrix[i][indexMinSum];
                    matrix[i][indexMinSum] = buf;
                }
        }
        return matrix;
    }

    /* A[i,j] * B[m,n] = C[i,n]
    length column A = length str B
    */
    public static int[][] multipliMatrix ( int[][] matrA, int[][] matrB ) {
        int lenStrA = matrA.length;
        int lenColB = matrB[0].length;
        int lenStrB = matrB.length;
        int[][] multiMatr = new int[lenStrA][lenColB];
        for ( int i = 0; i < lenStrA; i++ ) {
            for ( int j = 0; j < lenColB; j++ ) {
                // multiMatr[i][j] += a[i][k] * b[k][j] ( k = a[0].length = b.length )
                for ( int k = 0; k < lenStrB; k++ ) {
                    multiMatr[i][j] += matrA[i][k] * matrB[k][j];
                }
            }
        }
        return  multiMatr;
    }
}
