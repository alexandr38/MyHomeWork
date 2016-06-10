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
}
