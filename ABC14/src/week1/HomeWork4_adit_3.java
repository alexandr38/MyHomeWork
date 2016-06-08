package week1; /**
 * Created by sasha on 05.06.2016.
 */

import java.util.Scanner;

public class HomeWork4_adit_3 {

    /* Дано трехзначное число. Определить: а) верно ли, что все его цифры
    одинаковые; б) есть ли среди его цифр одинаковые.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // переменная для работы сканера

        System.out.println(" Введите трехзначное число " ); // сообщение пользователю
        int userNum = sc.nextInt(); // инициализация переменной и ожидание ввода первого значения

        int seniorNum  = userNum / 100 ;                        // старшая цифра
        int averageNum = ( userNum - seniorNum * 100 ) / 10 ;   // средняя цифра
        int youngNum   = ( userNum - seniorNum * 100 ) % 10 ;   // младшая цифра
        boolean theAllSame = seniorNum == averageNum && seniorNum == youngNum ; // все цифры одинаковые ?
        boolean theSame    = seniorNum == averageNum || seniorNum == youngNum
                                                        || averageNum == youngNum ; // есть ли одинаковые ?

        System.out.println( " все цифры числа одинаковые " + theAllSame);
        System.out.println( " в числе есть одинаковые цифры " + theSame);

    }
}
