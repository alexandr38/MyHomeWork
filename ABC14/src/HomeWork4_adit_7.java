/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_7 {

    /* ������ � ������ ����� �� 1 �� 12. �� ������ ������ ������ ��������� �
     ������� ����. ���� ������������ ������ ������������ �����, ���������
     ������ ������ ��������� �� ������.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" enter the month number in the range from 1 to 12 " ); // ��������� ������������
        byte monthNum = sc.nextByte(); // ������������� ���������� � �������� ����� ������� ��������

        switch ( monthNum ) {
            case 12:
            case 1 :
            case 2 :
                System.out.println( "season - winter " ) ;
                break ;

            case 3 :
            case 4 :
            case 5 :
                System.out.println( "season - spring " ) ;
                break ;

            case 6 :
            case 7 :
            case 8 :
                System.out.println( "season - summer " ) ;
                break ;

            case 9 :
            case 10 :
            case 11 :
                System.out.println( "season - autumn " ) ;
                break ;

            default :
                System.out.println( "incorrect month number ");
                break;
        }

    }
}
