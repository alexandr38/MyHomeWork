package week1; /**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner ;


public class HomeWork4_3 {

    /* Пользователь вводит число.
    Вывести на экран его удвоенное значение, если число делится на 7 нацело. */

    public static void main(String[] args) {

        // переменная для работы сканера
        Scanner sc = new Scanner(System.in);

        // сообщение пользователю
        System.out.println(" Введите целое число ... " );

        // инициализация переменной и ожидание ввода пользователя
        int userNumber = sc.nextInt();

        if ( (userNumber % 7) == 0 ) System.out.println( " удвоеннное значение равно " + userNumber * 2 );
            else System.out.println( " введенное значение " + ' ' + userNumber + ' ' + " нацело на 7 не делится. " );



    }
}
