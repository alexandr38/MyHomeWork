package week3;

import week2.MyStringUtil;

import java.util.Scanner;

/**
 * Created by sasha on 22.06.2016.
 */
public class HomeWork3_12 {
   /* user enter the password twice
     - length of password in 8to 20 symbols
     - in password must be upper and lower case symbol
     - and number
     - dont have word 'password', 'pass', 'gfhjkm'
     - generate random password: a-z A-Z 0-9
    */
   public static void main(String[] args) {
       boolean err = false;
       Scanner sc = new Scanner(System.in);
       System.out.println( "length of password in 8to 20 symbols" );
       System.out.println( "password must be upper and lower case symbol and number" );
       System.out.println( " dont have word 'password', 'pass', 'gfhjkm' " );
       System.out.println(" enter the password ");
       String pswd = sc.next();

       if ( !MyStringUtil.lengthPswd( pswd ) ) {
           System.out.println( "the length of password must be 8 - 20 symbols ");
       err = true; };
       else {};

       System.out.println( "Confirm the password" );
       String pswdCopy = sc.next();
   }
}
