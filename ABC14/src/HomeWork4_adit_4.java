/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_4 {

    /* �������� ��� ��������, ���� � ���������� � ���, ������ � ������ � �������.
     ����� �� ��� ������?
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter speed in km/h " ); // ��������� ������������
        float speedKm = sc.nextFloat(); // ������������� ���������� � �������� ����� ������� ��������

        System.out.println(" enter speed in m/sec " ); // ��������� ������������
        float speedM = sc.nextFloat(); // ������������� ���������� � �������� ����� ������� ��������

        float resultSpeed = speedKm * 1000/3600 ; // ������� ��/� -> �/�
        if ( resultSpeed == speedM ) System.out.println( " speed in km/h equal to the speed in m/sec " );
            else
                if ( resultSpeed > speedM ) System.out.println( "speed in km/h more speed in m/sec " );
                    else System.out.println( " speed in km/h less then the speed in m/sec " );
    }

}
