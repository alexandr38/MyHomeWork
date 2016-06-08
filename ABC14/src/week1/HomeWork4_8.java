package week1; /**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_8 {

    /* Вводим два числа, сравнить последнии цифры этих чисел
    (пользоваться оператором %)
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" Введите первое число " ); // сообщение пользователю
        int firstNum = sc.nextInt(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" Введите второе число " ); // сообщение пользователю
        int secondNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        boolean lastNum = firstNum % 10 == secondNum % 10 ; // сравнение последних чисел
        String resultMessage = Integer.toString(firstNum) + ' ' + Integer.toString(secondNum) + ' ' + '-' ;

        System.out.println( resultMessage + ' ' + lastNum ); // вывод результата


    }
}
