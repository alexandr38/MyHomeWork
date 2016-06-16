package week3;

import week2.MyStringUtil;

import java.util.Scanner;

/**
 * Created by Agryzkov on 16.06.2016.
 */
public class HomeWork3_8 {
    // first symbol in word to lower case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string ");
        String userStr = sc.next();
        String result = MyStringUtil.firstLowerCase( userStr );
        System.out.println( result );
    }
}
