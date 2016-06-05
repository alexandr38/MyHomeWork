/**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner ;

public class HomeWork4_5 {

    /* Вводим 2 числа. Если первое число больше второго,
     то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
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

        if (firstNum > secondNum)  System.out.println(" разница чисел " + (firstNum - secondNum));

        else
            if ( firstNum < secondNum )  System.out.println ( " сумма чисел " + ( firstNum + secondNum ) ) ;
                else System.out.println ( "числа равны " + firstNum + '=' + secondNum);
    }

}
