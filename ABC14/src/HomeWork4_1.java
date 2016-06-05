/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;


public class HomeWork4_1 {

    /* Пользователь вводит параметр с консоли (текущий час от 0 до 24)
				Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю") */

    public static void main(String[] args) {

        // переменная для работы сканера
        Scanner sc = new Scanner(System.in);

        // сообщение пользователю
        System.out.println(" Введите текущий час (от 0 до 24)... " );

        // инициализация переменной и ожидание ввода пользователя
        int time = sc.nextInt();

        // проверка условия и вывод результата
        if (time >= 9 && time <= 18) System.out.println(" Я на работе.") ;
        else System.out.println( " Я отдыхаю." );

    }

}
