/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_15 {

    /* Известны площади круга и квадрата. Определить: а) уместится ли круг в квадрат;
    б) уместится ли квадрат в круге.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                          // инициализация сканера
        String resultMessageCircleInSquare = " circle is placed in square - " ;       // строка сообщения для результата
        String resultMessageSquareInCircle = " the square is placed in a circle - " ; // строка сообщения для результата

        System.out.println(" enter area of a circle " );                    // приглашение пользователю
        float areaCircle = sc.nextFloat();                                  // чтение ввода

        System.out.println(" enter square area " );                         //  приглашение пользователю
        float areaSquare = sc.nextFloat();                                  // чтение ввода

        double sideSquare = Math.sqrt( areaSquare ) ;                       // сторона квадрата
        double diameterCircle = 2 * Math.sqrt( areaCircle / Math.PI ) ;     // диаметр круга

        // сторона квадрата больше или равна диаметру, круг вмещается в квадрат
        boolean circleInSquare = sideSquare >= diameterCircle ;
        //диаметр больше или равен диагонали квадрата, квадрат вмещается в круг
        boolean squareInCircle = diameterCircle >= Math.sqrt( 2 * areaSquare ) ;

        System.out.println( resultMessageCircleInSquare + circleInSquare + '\n');
        System.out.println( resultMessageSquareInCircle + squareInCircle );

    }

}
