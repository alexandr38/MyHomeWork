/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_7 {

    /* Вводим два числа, если одно из них делиться на другое без остатка,
то выводим тру и показываем результат деления (целую часть от деления  и остачу)
в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу) */


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


        boolean firstOnSecond = firstNum % secondNum == 0 ; // деление первого на второе нацело
        boolean secondOnFirst = secondNum % firstNum == 0 ; // деление второго на первое нацело

        System.out.println("первый операнд делится на второй без остатка" + ' ' + firstOnSecond );
        System.out.println ( "частное" + ' ' + firstNum / secondNum + ' ' + "остаток" + ' ' + firstNum % secondNum + '\n');
        System.out.println( "второй операнд делится на первый без остатка" + ' ' + secondOnFirst );
        System.out.println ( "частное" + ' ' + secondNum / firstNum + ' ' + "остаток" + ' ' + secondNum % firstNum + '\n');

    }
}
