package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */

import java.util.Scanner;

public class HomeWork7_2_2 {
    // Prime number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the positive integer more 1 ");
        int num = sc.nextInt();
        boolean primeNum = true;
        // 1 � ���� ����� �� ���������, ��� ������ true
        for ( int i = 2; i < num && primeNum; i++ ) {
            if (num%i == 0) { primeNum = false; }
        }
        System.out.println( "the enter positive integer is an prime number - " + primeNum );
    }
}
