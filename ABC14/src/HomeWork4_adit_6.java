/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_6 {

    /* У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" enter rate in km/h " ); // сообщение пользователю
        float rate = sc.nextFloat(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" enter distance in km " ); // сообщение пользователю
        float distance = sc.nextFloat(); // инициализация переменной и ожидание ввода второго значения

        if ( rate == 0) System.out.println( " rate must be greater than zero " );
            else {
                long travelTimeAllSec = ( long )Math.round ( ( distance / rate ) * 3600 ) ; // полное время в сек, округленное до целого
                long travelTimeHour = travelTimeAllSec / 3600 ;             // часы в пути
                long travelTimeMin = ( travelTimeAllSec % 3600 ) / 60 ;     // минуты в пути
                long travelTimeSec = ( travelTimeAllSec % 3600 ) % 60 ;     // секунды в пути
                String resultMessage = " travel time " + Long.toString( travelTimeHour ) + " hour  "
                                + Long.toString( travelTimeMin ) + " minute " + Long.toString(travelTimeSec) + " sec " ;
                System.out.println( resultMessage );
        }
    }
}
