/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_14 {

    /* 14) ����������, �������� �� ������������ ����� "����������"
    (����� ������ ���� ���� ����� ����� ��������� ���� ����).
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter the six-digit number " ); // ��������� ������������
        int sixDigNum = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        int sumThreeSenior = sixDigNum / 100000 + ( sixDigNum % 100000 ) / 10000 + ( ( sixDigNum % 100000 ) % 10000) / 1000 ; // ����� ���� �������
        int sumThreeYounger = ( sixDigNum % 1000 ) /100 + ( ( sixDigNum % 1000 ) % 100 ) / 10 + sixDigNum % 10 ;        // ����� ���� �������
        if ( sumThreeSenior == sumThreeYounger )
            System.out.println( " the number entered is happy " );
        else
            System.out.println( " the number entered is not happy " );


    }
}
