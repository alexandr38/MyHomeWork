package week2;

/**
 * Created by Agryzkov on 10.06.2016.
 */
public class HomeWork6_string_2 {

    /* Given a string, return a string where for every char in the original, there are two chars.
    doubleChar("The") ? "TThhee"
    doubleChar("AAbb") ? "AAAAbbbb"
    doubleChar("Hi-There") ? "HHii--TThheerree"
    */
    public String doubleChar(String str) {
        String result = new String ();
        switch ( str.length() ) {
            case 0 :
                break ;
            case 1 :
                result = str + str ;
                break ;
            default :
                for ( int i = 0 ; i < str.length() ; i++ ) {
                    result =result + str.charAt(i) + str.charAt(i) ;
                }
        }
        return result ;
    }

    /* Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    countCode("aaacodebbb") ? 1
    countCode("codexxcode") ? 2
    countCode("cozexxcope") ? 2
    */


    /* Return true if the given string contains a "bob" string,
    but where the middle 'o' char can be any char.
    bobThere("abcbob") ? true
    bobThere("b9b") ? true
    bobThere("bac") ? false
    */
    public boolean bobThere(String str) {
        boolean bob = false ;
        switch ( str.length() ) {
            case 0 :
            case 1 :
            case 2 :
                bob = false ;
                break ;
            case 3 :
                bob = str.charAt(0) == 'b' && str.charAt(2) == 'b';
                break ;
            default :
                for ( int i =1 ; i < str.length() - 2 && !bob ; i++ ) {
                    bob = str.charAt(i) == 'b' && str.charAt(i + 2) == 'b';
                }
                break ;
        }
        return bob ;
    }
    /* Given a string, consider the prefix string made of the first N chars of the string.
    Does that prefix string appear somewhere else in the string? Assume that the string is not empty
    and that N is in the range 1..str.length().
    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
     */
    public boolean prefixAgain(String str, int n) {
        boolean result = false ;
        switch ( str.length() ) {
            case 0 :
            case 1 :
                break ;
            default:
                String prefix = str.substring(0, n);
                result = str.indexOf( prefix, n ) != -1 ;
                break ;
        }
        return result ;
    }

    /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
     You may assume that n is between 0 and the length of the string, inclusive.
    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
    */
    public String repeatEnd(String str, int n) {
        String result = new String() ;
        switch (str.length() ) {
            case 0 :
                result = "" ;
                break ;
            default :
                if ( n <= str.length() ) {
                    for ( int i = 0 ; i < n ; i++ ) {
                        result += str.substring(str.length() - n ) ;
                    }
                }
                else result = "" ;
        }
        return result ;
    }

    /* Returns true if for every '*' (star) in the string, if there are chars both
    immediately before and after the star, they are the same.
    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true
    */
    public boolean sameStarChar(String str) {
        boolean result = false ;
        switch ( str.length() ) {
            case 0 :
                result = true ;
                break;
            case 1 :
                result = str.charAt(0) == '*' ;
                break ;
            case 2 :
                result = str.equals("**") ;
                break ;
            default :
                int posStar = str.indexOf('*') ;
                if ( posStar == -1 ) result = true ;
                else if ( posStar == str.length() - 1 ) result = false ;
                else {
                    for ( int i = 1 ; i < str.length() -1 ; i++ ) {
                        if ( str.charAt(i) == '*' )
                            result = str.charAt(i-1) == str.charAt(i+1) ;
                    }
                }
                break ;
        }
        return result ;
    }

    /* Return a version of the given string, where for every star (*) in the string the star
    and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
    */


}
