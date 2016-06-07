/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_15 {

    /* Известны площади круга и квадрата. Определить: а) уместится ли круг в квадрат;
     б) уместится ли квадрат в круге.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера
        String resultMessageCircleInSquare = " circle is placed in square - " ;       // круг помещается в квадрат
        String resultMessageSquareInCircle = " the square is placed in a circle - " ; // квадрат помещается в круг

        System.out.println(" enter area of a circle " ); // сообщение пользователю
        float areaCircle = sc.nextFloat();                   // инициализация переменной и ожидание ввода значения

        System.out.println(" enter square area " ); // сообщение пользователю
        float areaSquare = sc.nextFloat();              // инициализация переменной и ожидание ввода значения

        double sideSquare = Math.sqrt( areaSquare ) ;                     // сторона квадрата
        double diameterCircle = 2 * Math.sqrt( areaCircle / Math.PI ) ;   // диаметр круга

        boolean circleInSquare = sideSquare >= diameterCircle ;                  // круг помещается, если его диаметр меньше или равен стороне квадрата
        boolean squareInCircle = diameterCircle >= Math.sqrt( 2 * areaSquare ) ; // квадрат помещается, если его дигональ меньше или равна диаметру круга

        System.out.println( resultMessageCircleInSquare + circleInSquare + '\n');
        System.out.println( resultMessageSquareInCircle + squareInCircle );

    }

}
