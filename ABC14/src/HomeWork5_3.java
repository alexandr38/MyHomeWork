/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_3 {

    /* 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы со сканером
        int countChar = 0 ;                  // инициализация счетчика символов

        System.out.println(" enter a positive integer " ); // приглашение пользователю
        int number = sc.nextInt();                         // чтение ввода пользователя

        String numString = Integer.toString ( number ) ;        // конвертация числа в строку
        for (int i = 0; i <= ( numString.length() - 1) ; i++ )  // цикл для подсчета символов
        {
            if ( numString.charAt(i) == '8') countChar++ ;      // если текущий равен 8, то нарастить счетчик

        }
        System.out.println( " 8 including a number of - " + countChar);


    }
}
