/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_3 {

    /* 5.3. ��������� ������� ��� ����������� ������ 8 � �������� �����, ������� ������ ���� */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        int countChar = 0 ;                  // ������� �������� � ��������� ��������������

        System.out.println(" enter a positive integer " ); // ��������� ������������
        int number = sc.nextInt();                         // ������������� ���������� � �������� ����� ��������

        String numString = Integer.toString ( number ) ;    // ������������ ����� � ������
        for (int i = 0; i <= ( numString.length() - 1) ; i++ )
        {
            if ( numString.charAt(i) == '8') countChar++ ;  // ���� ������� ������ ������ ����� 8, ���������� �������

        }
        System.out.println( " 8 including a number of - " + countChar);


    }
}
