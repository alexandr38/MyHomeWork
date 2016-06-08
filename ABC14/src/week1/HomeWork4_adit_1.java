package week1; /**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_1 {

    /* Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
    лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" Введите первое число " ); // сообщение пользователю
        int firstNum = sc.nextInt(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" Введите второе число " ); // сообщение пользователю
        int secondNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        System.out.println(" Введите третье число " ); // сообщение пользователю
        int thirdNum = sc.nextInt(); // инициализация переменной и ожидание ввода второго значения

        if ( firstNum < secondNum + thirdNum && secondNum < firstNum + thirdNum &&  thirdNum < firstNum + secondNum)
        {
            System.out.println(" треугольник существует ");
            if (Math.pow(firstNum, 2) == Math.pow(secondNum, 2) + Math.pow(thirdNum, 2)||
                     Math.pow(secondNum, 2) == Math.pow(firstNum, 2) + Math.pow(thirdNum, 2) ||
                         Math.pow(thirdNum, 2) == Math.pow(secondNum, 2) + Math.pow(firstNum, 2))
                            System.out.println( " треугольник прямоугольный " );
            else System.out.println( " треугольник не прямоугольный " );
        }
        else System.out.println( " треугольник не существует " );


    }
}
