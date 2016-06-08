package week1; /**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_10 {

    /* Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям
     предоставляется 20% скидка. Ввести продолжительность разговора и день недели (цифра от 1 до 7).
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // инициализация сканера
        double priceCall ;                      // стоимость разговора
        int tariff = 2 ;                        // условный тариф за минуту разговора
        byte discount ;                         // скидка

        System.out.println(" enter call duration in seconds " ); // приглашение пользователю
        int duration = sc.nextInt();                             // чтение ввода

        System.out.println(" day of the week from 1 to 7 " ); // приглашение пользователю
        int dayWeek = sc.nextInt();                           // чтение ввода

        String resultMessage = " day " + "= " + dayWeek + " duration " + "= " + duration ; // строка для вывода результата
        switch ( dayWeek ) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                discount = 0 ;                                         // скидки сегодня нет
                priceCall = Math.ceil( duration / 60) * tariff ;        // время в мин и округляем до большего целого
                resultMessage = resultMessage + " discount " + "= " + discount + " price " + "= " + priceCall ; // готовая к выводу строка
                System.out.println( resultMessage );
                break ;

            case 6 :
            case 7 :
                discount = 20 ;                                        // есть скидка
                priceCall = 0.8 * Math.ceil( duration / 60) * tariff ; // время в мин и округляем до большего целого и со скидкой
                resultMessage = resultMessage + " discount " + "= " + discount + " price " + "= " + priceCall ;   // готовая к выводу строка
                System.out.println( resultMessage );
                break ;

            default :
                System.out.println( "incorrect number of day ");
                break ;
                    }




    }

}
