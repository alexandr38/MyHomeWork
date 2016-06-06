/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_12 {

    /* Написать программу, которая в зависимости от характера ветра выдает сообщение о его скорости
    от 1до 4 м/с - слабый (1); от 5-10 м/c - умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера
        String resultMessage ;  // строка для вывода результата

        System.out.println(" введите характер ветра от 1 до 4 " ); // сообщение пользователю
        byte wind = sc.nextByte(); // инициализация переменной и ожидание ввода значения

        switch ( wind ) {
            case 1 :
                resultMessage = " от 1до 4 м/с - слабый " ;
                break;

            case 2 :
                resultMessage = " от 5-10 м/c - умеренный " ;
                break;

            case 3 :
                resultMessage = " от 9-18 м/c - сильный " ;
                break;

            case 4 :
                resultMessage = " больше 19 м/c - ураганный " ;
                break;

            default:
                resultMessage = " некорректное значение " ;
                break;
        }
        System.out.println( resultMessage );

    }

}
