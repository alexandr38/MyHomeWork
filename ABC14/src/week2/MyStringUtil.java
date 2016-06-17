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

}

