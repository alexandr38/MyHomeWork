/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_8 {

    /* ��������� ��������� ������� � ������ ������. ������ � 10% ���������������,
     ���� ����� ������� ��������� 1000 ������.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter the purchase price " ); // ��������� ������������
        double price = sc.nextFloat(); // ������������� ���������� � �������� ����� ��������

        int discount = 0 ; //  ��������� �������� ������

        if ( price > 1000 ) {
            discount = 10 ;
            price = Math.rint(price * 90) / 100 ;
        }
        String resultMessage = " discount = " + discount + "% " + " price with discount = " + price ;
        System.out.println( resultMessage );
    }
}
