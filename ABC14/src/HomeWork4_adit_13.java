/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_13 {

    /* ���� ��� ����� A,B,C. ��������� ����� � ��� ����,
     ���� A+B+C>0, � ��������� ������ �������� �� ����.
      */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������
        String resultMessageOperNum ; // ��� ����� ������ �� �������� ��� �������

        System.out.println(" enter first number" ); // ��������� ������������
        int firstNum = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        System.out.println(" enter second number" ); // ��������� ������������
        int secondNum = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        System.out.println(" enter third number" ); // ��������� ������������
        int thirdNum = sc.nextInt(); // ������������� ���������� � �������� ����� ��������

        boolean sum = ( ( firstNum + secondNum + thirdNum ) > 0) ;
        String resultMessageSum = ( " the sum of the numbers entered is greater than zero " +"- " + sum + " \n") ;  // ������ ��� ������ ����������
        if ( sum == true )  {
            firstNum *= 2 ;
            secondNum *= 2 ;
            thirdNum *= 2 ;
            resultMessageOperNum = " the number increased twice : " ;
        }
        else {
            firstNum = secondNum = thirdNum = 0;
            resultMessageOperNum = " number replaced by zero : " ;
        }
        System.out.println( resultMessageSum + resultMessageOperNum + Integer.toString( firstNum ) + ", " +
                                            Integer.toString( secondNum ) + ", " + Integer.toString( thirdNum ) ) ;

    }
}
