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
       Scanner sc = new Scanner(System.in);

       System.out.println( "0 - generate random password, \n 1 - user enter password \n ");
       byte selection = sc.nextByte();

       switch ( selection ) {
           case 0 :
               System.out.println( "random password: " + MyStringUtil.generatePswd() );
               break;

           case 1 :
               boolean err;
               do {
                   err = false;
                   System.out.println("length of password in 8 to 20 symbols");
                   System.out.println("password must be upper and lower case symbol and number");
                   System.out.println("do not have word 'password', 'pass', 'gfhjkm' ");
                   System.out.println(" enter the password ");
                   String pswd = sc.next();

                   if ( !checkPswd( pswd ) ) {
                       System.out.println("Confirm the password");
                       String pswdCopy = sc.next();
                       if (!MyStringUtil.confirmPswd(pswd, pswdCopy)) {
                           System.out.println( "Passwords do not match \n" );
                           err = true;
                       } else {
                           System.out.println( "password correct. Congratulations." );
                       }
                   }
               } while ( err );
               break;
           
           default :
               System.out.println( "incorrect selection ");
               break;
       }

   }

    // check password
    public static boolean checkPswd( String pswd ) {
        boolean err = false;
        if (!MyStringUtil.lengthPswd(pswd)) {
            System.out.println("the length of password must be 8 - 20 symbols \n");
            err = true;
        } else {
            if (!MyStringUtil.upperCaseSymb(pswd)) {
                System.out.println("password must contain uppercase characters \n" );
                err = true;
            } else {
                if (!MyStringUtil.lowerCaseSymb(pswd)) {
                    System.out.println( "password must contain lowercase characters \n" );
                    err = true;
                } else {
                    if (!MyStringUtil.numberSymb(pswd)) {
                        System.out.println( "password must contain numbers \n" );
                        err = true;
                    } else {
                        if (MyStringUtil.isNotWord(pswd)) {
                            System.out.println( "password do not have word 'password', 'pass', 'gfhjkm' \n" );
                            err = true;
                        }
                    }
                    ;
                }
                ;
            }
            ;
        }
        ;
        return err;
    }
}
