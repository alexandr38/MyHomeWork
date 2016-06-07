/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_4 {

    /* Известны две скорости, одна в километрах в час, другая в метрах в секунду.
    Какая из них больше?
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы со сканером

        System.out.println(" enter speed in km/h " ); // приглашение пользователю
        float speedKm = sc.nextFloat();               // чтение ввода

        System.out.println(" enter speed in m/sec " ); // приглашение пользователю
        float speedM = sc.nextFloat();                 // чтение ввода

        float resultSpeed = speedKm * 1000/3600 ;       // перевод км/ч в м/сек

        // сравнение скоростей и вывод результата
        if ( resultSpeed == speedM ) System.out.println( " speed in km/h equal to the speed in m/sec " );
            else
                if ( resultSpeed > speedM ) System.out.println( "speed in km/h more speed in m/sec " );
                    else System.out.println( " speed in km/h less then the speed in m/sec " );
    }

}
