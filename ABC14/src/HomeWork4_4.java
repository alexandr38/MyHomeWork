/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;


public class HomeWork4_4 {

    /* Вводим число с плавающей точкой с консоли,
     и проверяем лежит ли оно в диапазоне от 0 до 1
      */

    public static void main(String[] args) {

        // переменная для работы сканера
        Scanner sc = new Scanner(System.in);

        // сообщение пользователю
        System.out.println(" Введите число с плавающей запятой ... " );

        // инициализация переменной и ожидание ввода пользователя
        float userNumber = sc.nextFloat();

        if ( userNumber >= 0 && userNumber <= 1 ) System.out.println( " число " + userNumber + " принадлежит диапазону от 0 до 1 ");
        else System.out.println( " число " + userNumber + " не принадлежит диапазону от 0 до 1 ");
    }
}
