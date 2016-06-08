package week1; /**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_6 {

    /* У вас есть скорость и растояние, за какое время вы приедете в пукт назначания  */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // инициализация сканера

        System.out.println(" enter rate in km/h " ); // приглашение пользователю
        float rate = sc.nextFloat();                 // чтение ввода

        System.out.println(" enter distance in km " ); // приглашение пользователю
        float distance = sc.nextFloat();               // чтение ввода

        if ( rate == 0) System.out.println( " rate must be greater than zero " );  // проверка введенной скорости
            else {
                long travelTimeAllSec = ( long )Math.round ( ( distance / rate ) * 3600 ) ; // расчет времени в сек
                long travelTimeHour = travelTimeAllSec / 3600 ;             // перевод в часы
                long travelTimeMin = ( travelTimeAllSec % 3600 ) / 60 ;     // перевод в минуты
                long travelTimeSec = ( travelTimeAllSec % 3600 ) % 60 ;     // остаток секунд
                String resultMessage = " travel time " + Long.toString( travelTimeHour ) + " hour  "
                                + Long.toString( travelTimeMin ) + " minute " + Long.toString(travelTimeSec) + " sec " ;
                System.out.println( resultMessage );
        }
    }
}
