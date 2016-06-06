/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_11 {

    /* Написать программу, которая при вводе числа в диапазоне от 1 до 99
    добавляет к нему слово "копейка" в правильной форме. Например,
    1 копейка, 5 копеек, 42 копейки .
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" введите кол-во копеек от 1 до 99 " ); // сообщение пользователю
        int quantity = sc.nextInt(); // инициализация переменной и ожидание ввода значения

        if ( quantity > 10 && quantity < 20 )  System.out.println( quantity + " копеек ");
        else
            switch ( quantity % 10 ) {
                case 0 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                    System.out.println( quantity + " копеек ");
                    break ;

                case 1 :
                    System.out.println( quantity + " копейка ");
                    break ;

                case 2 :
                case 3 :
                case 4 :
                    System.out.println( quantity + " копейки ");
                    break ;
        }

    }

}

