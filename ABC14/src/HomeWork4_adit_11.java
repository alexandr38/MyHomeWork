/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_11 {

    /* �������� ���������, ������� ��� ����� ����� � ��������� �� 1 �� 99
    ��������� � ���� ����� "�������" � ���������� �����. ��������,
    1 �������, 5 ������, 42 ������� .
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" ������� ���-�� ������ �� 1 �� 99 " ); // ��������� ������������
        int quantity = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        if ( quantity > 10 && quantity < 20 )  System.out.println( quantity + " ������ ");
        else
            switch ( quantity % 10 ) {
                case 0 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                    System.out.println( quantity + " ������ ");
                    break ;

                case 1 :
                    System.out.println( quantity + " ������� ");
                    break ;

                case 2 :
                case 3 :
                case 4 :
                    System.out.println( quantity + " ������� ");
                    break ;
        }

    }

}

