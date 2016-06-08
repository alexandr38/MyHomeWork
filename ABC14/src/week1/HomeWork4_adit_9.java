package week1; /**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_9 {

    /* Написать программу вычисления идеального веса пользователя (рост-100).
    Выдать рекомендации о необходимости поправиться либо похудеть.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            // инициализация сканера

        System.out.println(" enter the growth " );      //приглашение пользователю
        int growth = sc.nextInt();                      // чтение ввода

        System.out.println(" enter the weight " );       // приглашение пользователю
        int weight = sc.nextInt();                       // чтение ввода

        if ( growth <= 100 ) System.out.println( "incorrect growth. growth should be greather than 100 " );
        else {
            if ((growth - 100) < weight)
                System.out.println(" you weigh more than the ideal, it is recommended to lose weight ");
            else if ((growth - 100) > weight)
                            System.out.println(" your weight is less than ideal, it is recommended to recover ");
                 else System.out.println(" Your ideal weight ");
        }
    }


}
