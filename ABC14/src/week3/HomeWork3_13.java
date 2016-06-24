package week3;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

/**
 * Created by Agryzkov on 24.06.2016.
 */
public class HomeWork3_13 {
    // sea fight
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( " enter the size of field ( max size 26x26 )" );
        int matrSize = sc.nextInt();

        if ( matrSize > 26 ) {
            System.out.println( "incorrect size of field" );
        } else {
            // build fields
            String[][] batleField = MyMatrixUtil.createBattlefield(matrSize);
            MyMatrixUtil.printStrMatrix(batleField);

            // generate ship
            int[] coordinatesShip = genShip( matrSize );

            // shut of user and search coordinates on the batleField
            int[] coordinateAtack = shutUsersOnField( batleField );

            // check shut
        }
    }

    // generate ship
    public static int[] genShip( int border ) {
        int[] ship = new int[2];
        ship[0] = 1 + (int)( Math.random()*border ); // row
        ship[1] = 1 + (int)( Math.random()*border ); // column
        return ship;
    }

    // shut of user and search coordinates on the batleField
    public static int[] shutUsersOnField ( String[][] batleField ) {

        Scanner sc = new Scanner(System.in);
        int[] coordinateShut = {0, 0}; // coordinate shut on the field
        boolean err;

        do {
        err = false;
        System.out.println( " simple of shut 'a1, A1'. shuting!  " );
        String shut = sc.next();
        if ( !Character.isAlphabetic( shut.charAt(0) ) ) {
                System.out.println( "incorrect shut! \n" );
                err = true;
            } else {
                if ( Integer.valueOf( shut.substring(1) ) > batleField.length ) {
                    System.out.println( "out of field! \n" );
                    err = true;
                } else {
                    // search number of symbol
                    coordinateShut[1] = Integer.valueOf( shut.substring(1) ); // column
                    for ( int i = 0; i < batleField.length; i++ ) {           // row
                        if (batleField[i][0].equals(shut.substring(0, 1).toUpperCase())) {
                            coordinateShut[0] = i;
                        }
                    }
                    if ( coordinateShut[0] == 0) {
                        System.out.println( "out of field! \n" );
                        err = true;
                    }
                }
            }
        } while ( err );
        return coordinateShut;
    }

}
