/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_8 {

    /* ¬ычислить стоимость покупки с учетом скидки. —кидка в 10% предоставл€етс€,
     если сумма покупки превышает 1000 гривен.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменна€ дл€ работы сканера

        System.out.println(" enter the purchase price " ); // сообщение пользователю
        double price = sc.nextFloat(); // инициализаци€ переменной и ожидание ввода значени€

        int discount = 0 ; //  начальное значение скидки

        if ( price > 1000 ) {
            discount = 10 ;
            price = Math.rint(price * 90) / 100 ;
        }
        String resultMessage = " discount = " + discount + "% " + " price with discount = " + price ;
        System.out.println( resultMessage );
    }
}
