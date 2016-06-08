package week1; /**
 * Created by Agryzkov on 07.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_13 {

    /* Даны три числа A,B,C. Увеличить числа в два раза,
    если A+B+C>0, в противном случае заменить на нули.
      */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // инициализация сканера
        String resultMessageOperNum = new String(); // строка результата

        System.out.println(" enter first number" ); // приглашение пользователю
        int firstNum = sc.nextInt();                // чтение ввода

        System.out.println(" enter second number" ); // приглашение пользователю
        int secondNum = sc.nextInt();                // чтение ввода

        System.out.println(" enter third number" ); // приглашение пользователю
        int thirdNum = sc.nextInt();                // чтение ввода

        boolean sum = ( ( firstNum + secondNum + thirdNum ) > 0) ;  // проверка суммы чисел
        String resultMessageSum = ( " the sum of the numbers entered is greater than zero " +"- " + sum + " \n") ;  // подготовка строки к выводу
        if ( sum == true )  {               // если верно, то удвоить числа
            firstNum *= 2 ;
            secondNum *= 2 ;
            thirdNum *= 2 ;
            resultMessageOperNum = " the number increased twice : " ;
        }
        else {
            firstNum = secondNum = thirdNum = 0;
            resultMessageOperNum = " number replaced by zero : " ;   // сумма<0, заменяем на ноль
        }
        System.out.println( resultMessageSum + resultMessageOperNum + Integer.toString( firstNum ) + ", " +
                                            Integer.toString( secondNum ) + ", " + Integer.toString( thirdNum ) ) ;

    }
}
