package week1; /**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork5_2 {

    /* 5.2. Вычислить факториал числа. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // инициализация сканера
        double factNumber = 1 ;              // начальное значение факториала

        System.out.println(" enter a positive integer " ); // приглашение пользователю
        int number = sc.nextInt();                         // чтение ввода пользователя
        String resultMessage = " factorial [ " + number + " ] = "; // строка для вывода результата

        switch (number) {
                case 0:                     // факториал нуля 1
                    factNumber = 1;
                default: {                   // вычисление факториала числа
                    for (int i = 1; i <= number; i++) {
                        factNumber = factNumber * i;
                    }
                }
            }
        System.out.println( resultMessage + factNumber );


    }
}
