package week3;

import week2.MyStringUtil;

import java.util.Scanner;

/**
 * Created by sasha on 21.06.2016.
 */
public class HomeWork3_10 {
    // delete copy of word in the string
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the string ");
        String str = sc.nextLine();

        System.out.println( "result string without doubles");
        System.out.println(MyStringUtil.delCopyWord(str) );
    }
}
