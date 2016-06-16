package week3;

import week2.MyStringUtil;

import java.util.Scanner;

/**
 * Created by Agryzkov on 16.06.2016.
 */

public class HomeWork3_7 {
    // very long word in the string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string ");
        String userStr = sc.nextLine();
        System.out.println( "very long word " + MyStringUtil.searchLongestWord( userStr ) );
    }
}
