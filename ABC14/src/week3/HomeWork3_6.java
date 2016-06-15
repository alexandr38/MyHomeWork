package week3;

import week2.MyStringUtil;

import java.util.Scanner;

/**
 * Created by Agryzkov on 15.06.2016.
 */
public class HomeWork3_6 {
    // sequence of numbers 0 and 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the sequence of numbers ");
        String numStr = sc.next();
        int[] search0 = MyStringUtil.searchLongestChain( numStr, '0');
        System.out.println( search0[0] );
        System.out.println( search0[1] );
        int[] search1 = MyStringUtil.searchLongestChain( numStr, '1');
        System.out.println( search0[0] );
        System.out.println( search0[1] );
    }
}
