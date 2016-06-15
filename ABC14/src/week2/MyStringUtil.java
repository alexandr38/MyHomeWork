package week2;

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

    //Find the longest chain 0 and 1
    //public static int[] searchLongestChain ( String str ) {


}
