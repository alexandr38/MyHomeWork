package week1; /**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_14 {

    /* Определить, является ли шестизначное число "счастливым"
    (сумма первых трех цифр равна сумме последних трех цифр)..
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                    // инициализация сканера

        System.out.println(" enter the six-digit number " );    // приглашение пользователю
        int sixDigNum = sc.nextInt();                           // чтение ввода

        int sumThreeSenior = sixDigNum / 100000 + ( sixDigNum % 100000 ) / 10000 + ( ( sixDigNum % 100000 ) % 10000) / 1000 ; // сумма трех старших
        int sumThreeYounger = ( sixDigNum % 1000 ) /100 + ( ( sixDigNum % 1000 ) % 100 ) / 10 + sixDigNum % 10 ;              // сумма трех младших
        if ( sumThreeSenior == sumThreeYounger )                                                // если равны
            System.out.println( " the number entered is happy " );                              // счастливое
        else
            System.out.println( " the number entered is not happy " );


    }
}
