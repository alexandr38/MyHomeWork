/**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_13 {

    /* Даны три числа A,B,C. Увеличить числа в два раза,
     если A+B+C>0, в противном случае заменить на нули.
      */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера
        String resultMessageOperNum ; // тут будет запись об операции над числами

        System.out.println(" enter first number" ); // сообщение пользователю
        int firstNum = sc.nextInt(); // инициализация переменной и ожидание ввода значения

        System.out.println(" enter second number" ); // сообщение пользователю
        int secondNum = sc.nextInt(); // инициализация переменной и ожидание ввода значения

        System.out.println(" enter third number" ); // сообщение пользователю
        int thirdNum = sc.nextInt(); // инициализация переменной и ожидание ввода значения

        boolean sum = ( ( firstNum + secondNum + thirdNum ) > 0) ;
        String resultMessageSum = ( " the sum of the numbers entered is greater than zero " +"- " + sum + " \n") ;  // строка для вывода результата
        if ( sum == true )  {
            firstNum *= 2 ;
            secondNum *= 2 ;
            thirdNum *= 2 ;
            resultMessageOperNum = " the number increased twice : " ;
        }
        else {
            firstNum = secondNum = thirdNum = 0;
            resultMessageOperNum = " number replaced by zero : " ;
        }
        System.out.println( resultMessageSum + resultMessageOperNum + Integer.toString( firstNum ) + ", " +
                                            Integer.toString( secondNum ) + ", " + Integer.toString( thirdNum ) ) ;

    }
}
