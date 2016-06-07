/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_5 {

    /* Даны три числа a, b, c. Определить,
    имеется ли среди них хотя бы одна пара равных
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // инициализация сканера

        System.out.println(" enter first number " ); // приглашение пользователю
        int firstNum = sc.nextInt();                 // чтение ввода

        System.out.println(" enter second number " ); // приглашение пользователю
        int secondNum = sc.nextInt();                 // чтение ввода

        System.out.println(" enter third number " );   // приглашение пользователю
        int thirdNum = sc.nextInt();                   // чтение ввода

        boolean couple = firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum ; // поиск пары равных
        System.out.println( "among the entered numbers, there are couple of equal " + "- " + couple );


    }
}
