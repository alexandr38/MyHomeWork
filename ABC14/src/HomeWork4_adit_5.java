/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_5 {

    /* ���� ��� ����� a, b, c. ����������,
    ������� �� ����� ��� ���� �� ���� ���� ������
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter first number " ); // ��������� ������������
        int firstNum = sc.nextInt(); // ������������� ���������� � �������� ����� ������� ��������

        System.out.println(" enter second number " ); // ��������� ������������
        int secondNum = sc.nextInt(); // ������������� ���������� � �������� ����� ������� ��������

        System.out.println(" enter third number " ); // ��������� ������������
        int thirdNum = sc.nextInt(); // ������������� ���������� � �������� ����� ������� ��������

        boolean couple = firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum ; // ����� ����
        System.out.println( "among the entered numbers, there are couple of equal " + "- " + couple );


    }
}
