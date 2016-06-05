/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner ;

public class HomeWork4_2 {

    /* Пользователь вводит три числа с консоли,
    нужно вывести на консоль наибольшее, наименьшее
     */

    public static void main(String[] args) {

        // переменная для работы сканера
        Scanner sc = new Scanner(System.in);

        // сообщение пользователю
        System.out.println(" Введите первое число " );

        // инициализация переменной и ожидание ввода первого значения
        float firstNum = sc.nextFloat();


        // сообщение пользователю
        System.out.println(" Введите второе число " );

        // инициализация переменной и ожидание ввода второго значения
        float secondNum = sc.nextFloat();


        // сообщение пользователю
        System.out.println(" Введите третье число " );

        // инициализация переменной и ожидание ввода третьего значения
        float thirdNum = sc.nextFloat();


        // переменная для максимума с начальной установкой
        float max = firstNum;

        // переменная для минимума с начальной установкой
        float min = firstNum;

        // вычисление максимума
        if ( secondNum > max ) max = secondNum ;
        if ( thirdNum > max ) max = thirdNum;

        // вычисление минимума
        if ( secondNum < min ) min = secondNum;
        if ( thirdNum < min ) min = thirdNum;


        // вывод результата
        System.out.println(" максимальное значение " + ' ' + max);
        System.out.println(" минимальное значение " + ' ' + min);




    }
}
