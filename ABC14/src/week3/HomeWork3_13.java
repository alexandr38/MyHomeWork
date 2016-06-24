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
        System.out.println( " enter the size of field ( max size 26x26, min size 2x2 )" );
        int matrSize = sc.nextInt();

        if ( matrSize > 26 || matrSize < 2 ) {
            System.out.println( "incorrect size of field" );
        } else {
            // build fields
            String[][] batleField = MyMatrixUtil.createBattlefield(matrSize);
            MyMatrixUtil.printStrMatrix(batleField);

            // generate ship
            int[] coordinatesShip = genShip( matrSize );

            boolean batleResult = false;
            while ( !batleResult ) {
                // shut of user and search coordinates on the batleField
                int[] coordinateAtack = shutUsersOnField(batleField);

                // check shut result
                batleResult = chekShutResult( coordinateAtack, coordinatesShip, batleField );
            }
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
        switch ( shut.length() ) {
            case 2 :
                err = Character.isAlphabetic( shut.charAt(0) ) & Character.isDigit(shut.charAt(0));
                break;
            case 3 :
                err = Character.isAlphabetic( shut.charAt(0) ) & Character.isDigit( shut.charAt(0) ) & Character.isDigit( shut.charAt(0) );
                break;
            default :
                err = true;
                break;
        }
        if ( err ) {
                System.out.println( "incorrect shut! \n" );
            } else {
                if ( Integer.valueOf( shut.substring(1) ) > batleField.length || Integer.valueOf( shut.substring(1) ) < 1 ) {
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

    // check shut result
    public static boolean chekShutResult( int[] shut, int[] ship, String[][] batleField ) {
        boolean result = false;
        String upDownHelp = " :) ";
        String leftRightHelp = " :) ";
        int upDown = ship[0] - shut[0];
        int leftRight = ship[1] - shut[1];
        batleField[ship[0]][ship[1]] = "S";
        if (upDown == 0 && leftRight == 0 ) {
            batleField[ship[0]][ship[1]] = "X";
            result = true;
        } else {
            if (upDown < 0) {
                upDownHelp = "higher";
            } else {
                if (upDown > 0) {
                    upDownHelp = "lower";
                }
            }
            if (leftRight < 0) {
                upDownHelp = "left";
            } else {
                if (leftRight > 0) {
                    upDownHelp = "right";
                }
            }
            batleField[shut[0]][shut[1]] = "*";
            System.out.println( "shuting " + upDownHelp + " and " + leftRightHelp );
        }
        MyMatrixUtil.printStrMatrix( batleField );
        return result;
    }

}
