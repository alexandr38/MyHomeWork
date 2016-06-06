/**
 * Created by Agryzkov on 06.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_9 {

    /* Ќаписать программу вычислени€ идеального веса пользовател€ (рост- 100).
     ¬ыдать рекомендации о необходимости поправитьс€ либо похудеть.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменна€ дл€ работы сканера

        System.out.println(" enter the growth " ); // сообщение пользователю
        int growth = sc.nextInt(); // инициализаци€ переменной и ожидание ввода значени€

        System.out.println(" enter the weight " ); // сообщение пользователю
        int weight = sc.nextInt(); // инициализаци€ переменной и ожидание ввода значени€

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
