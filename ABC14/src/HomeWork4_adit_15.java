/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_15 {

    /* �������� ������� ����� � ��������. ����������: �) ��������� �� ���� � �������;
     �) ��������� �� ������� � �����.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        String resultMessageCircleInSquare = " circle is placed in square - " ;       // ���� ���������� � �������
        String resultMessageSquareInCircle = " the square is placed in a circle - " ; // ������� ���������� � ����

        System.out.println(" enter area of a circle " ); // ��������� ������������
        float areaCircle = sc.nextFloat();                   // ������������� ���������� � �������� ����� ��������

        System.out.println(" enter square area " ); // ��������� ������������
        float areaSquare = sc.nextFloat();              // ������������� ���������� � �������� ����� ��������

        double sideSquare = Math.sqrt( areaSquare ) ;                     // ������� ��������
        double diameterCircle = 2 * Math.sqrt( areaCircle / Math.PI ) ;   // ������� �����

        boolean circleInSquare = sideSquare >= diameterCircle ;                  // ���� ����������, ���� ��� ������� ������ ��� ����� ������� ��������
        boolean squareInCircle = diameterCircle >= Math.sqrt( 2 * areaSquare ) ; // ������� ����������, ���� ��� �������� ������ ��� ����� �������� �����

        System.out.println( resultMessageCircleInSquare + circleInSquare + '\n');
        System.out.println( resultMessageSquareInCircle + squareInCircle );

    }

}
