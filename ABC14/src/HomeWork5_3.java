/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_3 {

    /* 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера
        int countChar = 0 ;                  // счетчик символов с начальной инициализацией

        System.out.println(" enter a positive integer " ); // сообщение пользователю
        int number = sc.nextInt();                         // инициализация переменной и ожидание ввода значения

        String numString = Integer.toString ( number ) ;    // конвертируем число в строку
        for (int i = 0; i <= ( numString.length() - 1) ; i++ )
        {
            if ( numString.charAt(i) == '8') countChar++ ;  // если текущий символ строки равен 8, наращиваем счетчик

        }
        System.out.println( " 8 including a number of - " + countChar);


    }
}
