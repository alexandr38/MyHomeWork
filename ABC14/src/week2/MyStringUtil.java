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

}
