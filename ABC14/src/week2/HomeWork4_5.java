package week2;

/**
 * Created by sasha on 13.06.2016.
 */

import java.util.Scanner;

  /* 5) Заполнить массив случайными значениями.
    На четных индексах парные значения, на нечетных непарные
 */
public class HomeWork4_5 {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println(" enter the size of array ");
          int sizeArray = sc.nextInt();
          int[] evenOddArr = new int[ sizeArray ];
          for ( int i = 0; i < sizeArray ; i++ ) {
              if ( i%2 == 0 ) { evenOddArr[i] = (int)(Math.random()*100)*2; }
              else { evenOddArr[i] = (int)(Math.random()*100)*2 + 1; }
          }
          MyArrayUtil.printArray( evenOddArr, 0, sizeArray );
      }
}
