/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_9 {

    /* �������� ��������� ���������� ���������� ���� ������������ (����- 100).
     ������ ������������ � ������������� ����������� ���� ��������.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter the growth " ); // ��������� ������������
        int growth = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        System.out.println(" enter the weight " ); // ��������� ������������
        int weight = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        if ( growth <= 100 ) System.out.println( "incorrect growth. growth should be greather than 100 " );
        else {
            if ((growth - 100) < weight)
                System.out.println(" you weigh more than the ideal, it is recommended to lose weight ");
            else if ((growth - 100) > weight)
                            System.out.println(" your weight is less than ideal, it is recommended to recover ");
                 else System.out.println(" Your ideal weight ");
        }
    }


}
