/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_4 {

    /* Известны две скорости, одна в километрах в час, другая в метрах в секунду.
     Какая из них больше?
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" enter speed in km/h " ); // сообщение пользователю
        float speedKm = sc.nextFloat(); // инициализация переменной и ожидание ввода первого значения

        System.out.println(" enter speed in m/sec " ); // сообщение пользователю
        float speedM = sc.nextFloat(); // инициализация переменной и ожидание ввода первого значения

        float resultSpeed = speedKm * 1000/3600 ; // перевод км/ч -> м/с
        if ( resultSpeed == speedM ) System.out.println( " speed in km/h equal to the speed in m/sec " );
            else
                if ( resultSpeed > speedM ) System.out.println( "speed in km/h more speed in m/sec " );
                    else System.out.println( " speed in km/h less then the speed in m/sec " );
    }

}
