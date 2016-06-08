package week1; /**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_6 {

    /* Вводим два числа, вывести их суму,
    если она в диапазоне от 11 до 19
         */

    public static void main(String[] args) {
        // переменная для работы сканера
        Scanner sc = new Scanner(System.in);

        // сообщение пользователю
        System.out.println(" Введите первое число " );

        // инициализация переменной и ожидание ввода первого значения
        int firstNum = sc.nextInt();


        // сообщение пользователю
        System.out.println(" Введите второе число " );

        // инициализация переменной и ожидание ввода второго значения
        int secondNum = sc.nextInt();

        // инициализация переменной и получение значения
        long sum = firstNum + secondNum ;

        if ( sum >= 11 && sum <= 19 ) System.out.println( "сумма чисел "  + sum );

            else System.out.println( "сумма чисел не входит в диапазон от 11 до 19 " );
    }
}
