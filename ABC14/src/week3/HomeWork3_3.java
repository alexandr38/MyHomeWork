package week3;

import week2.MyStringUtil;
import java.util.Scanner;

/**
 * Created by Agryzkov on 15.06.2016.
 */
public class HomeWork3_3 {
    //Is palindrome string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the testable string ");
        String testStr = sc.next();
        System.out.println( "the testable string is palindrome - " + MyStringUtil.searchPalindrome( testStr ) );
    }
}
