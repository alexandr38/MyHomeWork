/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_1 {

    /* 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" 1 - translated into decimal notation, 2 - translation in binary system " ); // сообщение пользователю
        byte systemNotation = sc.nextByte();        // инициализация переменной и ожидание ввода значения

        switch ( systemNotation ) {
            case 1 :
                // перевод в десятичную систему
                System.out.println(" enter a binary number " ); // сообщение пользователю
                int binaryNum = sc.nextInt();        // инициализация переменной и ожидание ввода значения
                double binToDecNum = 0 ;             // результат перевода

                String binNumStr = Integer.toString ( binaryNum ) ;    // конвертируем число в строку
                for ( int i = 0, degree = binNumStr.length() - 1 ; i < binNumStr.length(); i++ , degree-- )  // degree - текущая степень двойки
                {
                   if ( binNumStr.charAt(i) == '1')  binToDecNum += Math.pow( 2, degree) ;
                }
                System.out.println( " decimal number = " + binToDecNum );
                break ;

            case 2 :
                // перевод в двоичную систему
                System.out.println(" Enter a decimal number " ); // сообщение пользователю
                int decNum = sc.nextInt();                       // инициализация переменной и ожидание ввода значения
                String decToBin = new String();                  // строка результата (пока пустая)

                while ( decNum >= 2 )
                {
                    decToBin = Integer.toString( decNum % 2) + decToBin ; // остаток от деления запоминаем в строку
                    decNum = decNum / 2 ;                                 // запоминаем целую часть для след. раза
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
