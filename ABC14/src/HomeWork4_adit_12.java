/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_12 {

    /* �������� ���������, ������� � ����������� �� ��������� ����� ������ ��������� � ��� ��������
    �� 1�� 4 �/� - ������ (1); �� 5-10 �/c - ��������� (2); �� 9-18 �/c - ������� (3); ������ 19 �/c - ��������� (4).
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        String resultMessage ;  // ������ ��� ������ ����������

        System.out.println(" ������� �������� ����� �� 1 �� 4 " ); // ��������� ������������
        byte wind = sc.nextByte(); // ������������� ���������� � �������� ����� ��������

        switch ( wind ) {
            case 1 :
                resultMessage = " �� 1�� 4 �/� - ������ " ;
                break;

            case 2 :
                resultMessage = " �� 5-10 �/c - ��������� " ;
                break;

            case 3 :
                resultMessage = " �� 9-18 �/c - ������� " ;
                break;

            case 4 :
                resultMessage = " ������ 19 �/c - ��������� " ;
                break;

            default:
                resultMessage = " ������������ �������� " ;
                break;
        }
        System.out.println( resultMessage );

    }

}
