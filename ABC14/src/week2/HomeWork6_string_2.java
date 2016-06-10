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

}
