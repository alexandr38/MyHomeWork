/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_10 {

    /* �������� ��������� ���������� ��������� �����������,
    ���� �� �������� � ������������ ��������������� 20% ������.
    ������ ����������������� ��������� � ���� ������ (����� �� 1 �� 7).
     */

    public static void main(String[] args) {

        /* ��� � �������� */

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        double priceCall ;  // ��������� ���������
        int tariff = 2 ;     // ��������� 1-�� ������
        byte discount ;  // ������

        System.out.println(" enter call duration in seconds " ); // ��������� ������������
        int duration = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        System.out.println(" day of the week from 1 to 7 " ); // ��������� ������������
        int dayWeek = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        String resultMessage = " day " + "= " + dayWeek + " duration " + "= " + duration ;
        switch ( dayWeek ) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                discount = 0 ;
                priceCall = Math.ceil( duration / 60) * tariff ;    // ������ ��������� ��������� ��� ������
                resultMessage = resultMessage + " discount " + "= " + discount + " price " + "= " + priceCall ; // ������������ ��������� ��� ������
                System.out.println( resultMessage );
                break ;

            case 6 :
            case 7 :
                discount = 20 ;
                priceCall = 0.8 * Math.ceil( duration / 60) * tariff ; // ������ ��������� ��������� �� �������
                resultMessage = resultMessage + " discount " + "= " + discount + " price " + "= " + priceCall ;   // ������������ ��������� ��� ������
                System.out.println( resultMessage );
                break ;

            default :
                System.out.println( "incorrect number of day ");
                break ;
                    }




    }

}
