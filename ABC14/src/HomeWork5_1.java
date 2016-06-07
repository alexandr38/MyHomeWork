/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_1 {

    /* 5.1. ������� � ����� � ���������� ������� ��������� � ��������, � ��������. ������������ ��� ������ ����� */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ���������� ��� ������ �������

        System.out.println(" 1 - translated into decimal notation, 2 - translation in binary system " ); // ��������� ������������
        byte systemNotation = sc.nextByte();        // ������������� ���������� � �������� ����� ��������

        switch ( systemNotation ) {
            case 1 :
                // ������� � ���������� �������
                System.out.println(" enter a binary number " ); // ��������� ������������
                int binaryNum = sc.nextInt();        // ������������� ���������� � �������� ����� ��������
                double binToDecNum = 0 ;             // ��������� ��������

                String binNumStr = Integer.toString ( binaryNum ) ;    // ������������ ����� � ������
                for ( int i = 0, degree = binNumStr.length() - 1 ; i < binNumStr.length(); i++ , degree-- )  // degree - ������� ������� ������
                {
                   if ( binNumStr.charAt(i) == '1')  binToDecNum += Math.pow( 2, degree) ;
                }
                System.out.println( " decimal number = " + binToDecNum );
                break ;

            case 2 :
                // ������� � �������� �������
                System.out.println(" Enter a decimal number " ); // ��������� ������������
                int decNum = sc.nextInt();                       // ������������� ���������� � �������� ����� ��������
                String decToBin = new String();                  // ������ ���������� (���� ������)

                while ( decNum >= 2 )
                {
                    decToBin = Integer.toString( decNum % 2) + decToBin ; // ������� �� ������� ���������� � ������
                    decNum = decNum / 2 ;                                 // ���������� ����� ����� ��� ����. ����
                    if ( decNum == 1 ) decToBin = '1' + decToBin ;
                }
                System.out.println( " binary number = " + decToBin );
                break ;

            default:
                System.out.println( " system selection error " );
                break ;
        }
    }
}
