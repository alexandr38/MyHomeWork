/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_5 {

    /* Даны три числа a, b, c. Определить,
    имеется ли среди них хотя бы одна пара равных
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" enter first number " ); // сообщение пользователю
        int firstNum = sc.nextInt(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" enter second number " ); // сообщение пользователю
        int secondNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        System.out.println(" enter third number " ); // сообщение пользователю
        int thirdNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        boolean couple = firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum ; // поиск пары
        System.out.println( "among the entered numbers, there are couple of equal " + "- " + couple );


    }
}
