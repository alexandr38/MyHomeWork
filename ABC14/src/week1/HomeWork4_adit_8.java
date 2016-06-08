package week1; /**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_8 {

    /* Вычислить стоимость покупки с учетом скидки. Скидка в 10%
    предоставляется, если сумма покупки превышает 1000 гривен.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // инициализация сканера

        System.out.println(" enter the purchase price " ); // приглашение пользователю
        double price = sc.nextFloat();                     // чтение ввода

        int discount = 0 ;                                  //  стартовое значение скидки

        if ( price > 1000 ) {                               //если условие - ок, расчет стоимости со скидкой
            discount = 10 ;
            price = Math.rint(price * 90) / 100 ;
        }
        String resultMessage = " discount = " + discount + "% " + " price with discount = " + price ;
        System.out.println( resultMessage );
    }
}
