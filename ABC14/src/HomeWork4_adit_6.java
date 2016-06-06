/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_6 {

    /* � ��� ���� �������� � ���������, �� ����� ����� �� �������� � ���� ����������
         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter rate in km/h " ); // ��������� ������������
        float rate = sc.nextFloat(); // ������������� ���������� � �������� ����� ������� ��������

        System.out.println(" enter distance in km " ); // ��������� ������������
        float distance = sc.nextFloat(); // ������������� ���������� � �������� ����� ������� ��������

        if ( rate == 0) System.out.println( " rate must be greater than zero " );
            else {
                long travelTimeAllSec = ( long )Math.round ( ( distance / rate ) * 3600 ) ; // ������ ����� � ���, ����������� �� ������
                long travelTimeHour = travelTimeAllSec / 3600 ;             // ���� � ����
                long travelTimeMin = ( travelTimeAllSec % 3600 ) / 60 ;     // ������ � ����
                long travelTimeSec = ( travelTimeAllSec % 3600 ) % 60 ;     // ������� � ����
                String resultMessage = " travel time " + Long.toString( travelTimeHour ) + " hour  "
                                + Long.toString( travelTimeMin ) + " minute " + Long.toString(travelTimeSec) + " sec " ;
                System.out.println( resultMessage );
        }
    }
}
