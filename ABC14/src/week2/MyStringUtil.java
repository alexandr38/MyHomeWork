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

}
