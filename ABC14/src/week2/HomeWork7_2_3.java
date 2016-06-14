package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork7_2_3 {
    // search and count 'a' in string
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string ");
        String userStr = sc.next();
        System.out.println( "enter the char for search ");
        String symbol = sc.next();
        char symb = symbol.charAt(0); // convert in char
        System.out.println( "symbol " + symbol + " in string search and count - " + MyStringUtil.searchCountSymbol(userStr, symb) );
    }
}
