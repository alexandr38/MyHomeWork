/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_1 {

    /*5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот.
    Пользователь сам вводит число
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы со сканером

        System.out.println(" 1 - translated into decimal notation, 2 - translation in binary system " ); // выбор системы счисления
        byte systemNotation = sc.nextByte();                                                             // 1 - в десятичную, 2 - в двоичную

        switch ( systemNotation ) {
            case 1 :
                // перевод в десятичную систему
                System.out.println(" enter a binary number " ); // приглашение пользователю для ввода двоичного числа
                int binaryNum = sc.nextInt();        // чтение ввода в переменную
                double binToDecNum = 0 ;             // результат перевода

                String binNumStr = Integer.toString ( binaryNum ) ;    // конвертация числа в строку
                for ( int i = 0, degree = binNumStr.length() - 1 ; i < binNumStr.length(); i++ , degree-- )  // degree - степень двойки
                {
                   if ( binNumStr.charAt(i) == '1')  binToDecNum += Math.pow( 2, degree) ;
                }
                System.out.println( " decimal number = " + binToDecNum );
                break ;

            case 2 :
                // перевод в двоичную систему счисления
                System.out.println(" Enter a decimal number " ); // приглашение пользователю для ввода десятичного числа
                int decNum = sc.nextInt();                       // чтение ввода в переменную
                String decToBin = new String();                  // строка результата

                while ( decNum >= 2 )
                {
                    decToBin = Integer.toString( decNum % 2) + decToBin ; // остаток от деления в результат
                    decNum = decNum / 2 ;                                 // целая часть для след. раза
                    if ( decNum == 1 ) decToBin = '1' + decToBin ;         // если последняя, добавить в результат
                }
                System.out.println( " binary number = " + decToBin );
                break ;

            default:
                System.out.println( " system selection error " );
                break ;
        }
    }
}
