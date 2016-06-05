/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_2 {

    /* Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
    тельные заменить на 0.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" Введите первое число " ); // сообщение пользователю
        int firstNum = sc.nextInt(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" Введите второе число " ); // сообщение пользователю
        int secondNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        System.out.println(" Введите третье число " ); // сообщение пользователю
        int thirdNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        if ( firstNum >= 0 ) System.out.println( " куб числа " + ' ' + Math.pow(firstNum, 3));
            else {  firstNum = 0;
                    System.out.println( "отрицательное значение заменено на " + ' ' + firstNum );
                }
        if ( secondNum >= 0 ) System.out.println( " куб числа " + ' ' + Math.pow(secondNum, 3));
        else {  secondNum = 0;
            System.out.println( "отрицательное значение заменено на " + ' ' + secondNum );
            }
        if ( thirdNum >= 0 ) System.out.println( " куб числа " + ' ' + Math.pow(thirdNum, 3));
        else {  thirdNum = 0;
            System.out.println( "отрицательное значение заменено на " + ' ' + thirdNum );
            }
    }
}
