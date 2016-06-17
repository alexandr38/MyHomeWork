package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork7_2_5 {
    // replace a->@
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string ");
        String userStr = sc.nextLine();
        System.out.println( "enter the char for search ");
        String symbol = sc.nextLine();
        System.out.println( " enter new char ");
        String newSymbol = sc.nextLine();
        // convert string to char
        char symb = symbol.charAt(0);
        char newSymb = newSymbol.charAt(0);
        String repUserStr = userStr.replace( symb, newSymb ) ;
        System.out.println( repUserStr );
    }
}
