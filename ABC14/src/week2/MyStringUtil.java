package week2;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Agryzkov on 14.06.2016.
 */
public class MyStringUtil {

    // search and count symbol
    public static int searchCountSymbol ( String str, char symbol ) {
        int countSymb = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == symbol ) { countSymb++ ;}
        }
        return countSymb;
    }

    //Is palindrome string
    public static boolean searchPalindrome ( String str ) {
        boolean ifPalindrom = false;
        for ( int i = 0, j = str.length() - 1; i < str.length()/2; i++, j-- )
        {
            if ( str.charAt(i) == str.charAt(j) ) {ifPalindrom = true ; }
        }
        return ifPalindrom;
    }

    //Find the longest chain char
    public static int[] searchLongestChain ( String str, char searchChar ) {
        // 0 - start pos, 1 - count
        int[] result = {0,0};
        int countChar = 0;
        //result[0] = str.indexOf( searchChar );
        for (int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == searchChar ) { countChar++; }
            else { if (result[1] < countChar ) { result[1] = countChar; result[0] = i - countChar; }
                countChar = 0; }
        }
        if (result[1] < countChar ) { result[1] = countChar; result[0] = str.length() - countChar; }
        return result;
    }

    //Find the longest word
    public static String searchLongestWord ( String str ) {
        int lengthWord = 0;
        int startPos = 0;
        int endPos = 0;
        String word = new String() ;
        for ( int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == ' ' )
            { if ( endPos-startPos+1 <= lengthWord) { endPos = i - 1;
                startPos = i - lengthWord;
            }
                lengthWord = 0;
            }
            else lengthWord++;
        }
        if ( lengthWord != 0&& endPos - startPos +1 <= lengthWord ) { word = str.substring( str.length() - lengthWord ); }
        else { word = str.substring( startPos, endPos + 1 ); }
        return word;
    }

    // first symbol in word to upper case
    public static String firstLowerCase ( String str ) {
        // cut first and last ' '
        String result = str.trim();
        switch (result.length()) {
            case 1:
                result = result.toUpperCase();
                break;
            default:
                result = result.substring(0, 1).toUpperCase() + result.substring(1);
                for (int i = 1; i < result.length() - 1; i++) {
                    if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                        result = result.substring(0, i + 1) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2);
                    }
                }
                break;
        }
        return result;
    }

    // delete copy word
    public static String delCopyWord( String str) {
        /* Set<String> words = new LinkedHashSet<String>();
        *  //string in low case and in to array
        *  String[] strArray = str.toLowerCase().split(" ");
        *  // build hash (every word gets once )
        *  words.addAll( Arrays.asList(strArray) );
        * String result = String.valueOf(words);
        */
        String[] strArray = str.toLowerCase().split(" ");

        String[] strRes = new String[strArray.length];
        String result = new String();

        for (int i = 0; i < strArray.length; i++ ) {
            boolean copy = false;
            for ( int j = 0; j < i & !copy; j++ ) {
                copy = strArray[i].equals(strRes[j]);
            }
            if ( !copy ) { strRes[i] = strArray[i];
                           result += ( ' ' + strArray[i]) ; }
        }
        return result;
    }

    // enter the password
    /*
      - length of password in 8to 20 symbols
     - in password must be upper and lower case symbol
     - and number
     - do not have word 'password', 'pass', 'gfhjkm'
     - generate random password: a-z A-Z 0-9
     */


    // length of password in 8to 20 symbols
    public static boolean lengthPswd ( String pswd ) {
        return pswd.length()>= 8 && pswd.length()<= 20 ;
    }

    //in password must be upper case symbol
    public static boolean upperCaseSymb ( String pswd ) {
        boolean uperCase = false;
        for ( int i = 0; i < pswd.length() & !uperCase; i++ ) {
            uperCase = Character.isAlphabetic( pswd.charAt(i) ) && Character.isUpperCase( pswd.charAt(i) );
        }
        return uperCase;
    }

    //in password must be lower case symbol
    public static boolean lowerCaseSymb ( String pswd ) {
        boolean lowerCase = false;
        for ( int i = 0; i < pswd.length() & !lowerCase; i++ ) {
            lowerCase = Character.isAlphabetic( pswd.charAt(i) ) && Character.isLowerCase(pswd.charAt(i));
        }
        return lowerCase;
    }

    //in password must be number
    public static boolean numberSymb ( String pswd ) {
        boolean number = false;
        for ( int i = 0; i < pswd.length() & !number; i++ ) {
            number = Character.isDigit(pswd.charAt(i));
        }
        return number;
    }

    //do not have word 'password', 'pass', 'gfhjkm'
    public static boolean isNotWord ( String pswd ) {
        String[] word = { "password", "pass", "gfhjkm" };
        boolean findWord = false;
        for (int i = 0; i < word.length & !findWord; i++ ) {
            findWord = pswd.toLowerCase().contains( word[i] );
        }
        return findWord;
    }

    // confirm password
    public static boolean confirmPswd ( String pswd, String pswdCopy ) {
        return pswd.equals( pswdCopy );
    }

    // generate random password of length 8 - 20
    public static String generatePswd() {
        // generate length of password: Min + (int)(Math.random() * ((Max - Min) + 1))
        byte length = (byte) ( 8 + (byte)( Math.random()*(20 - 8 + 1) ) );
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder randomPswd = new StringBuilder();

        // generate password
        for ( int i = 0; i < length; i++) {
            randomPswd.append( symbols.charAt((int)(Math.random()*symbols.length() )) );
        }
        return String.valueOf(randomPswd);
    }


}

