/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_2 {

    /* 5.2. ��������� ��������� �����. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        double factNumber = 1 ;              // ��������� ���������� ����������

        System.out.println(" enter a positive integer " ); // ��������� ������������
        int number = sc.nextInt(); // ������������� ���������� � �������� ����� ��������
        String resultMessage = " factorial [ " + number + " ] = ";

        switch (number) {
                case 0:
                    factNumber = 1;
                default: {
                    for (int i = 1; i <= number; i++) {
                        factNumber = factNumber * i;
                    }
                }
            }
        System.out.println( resultMessage + factNumber );


    }
}
