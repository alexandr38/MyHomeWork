package week3;

/**
 * Created by Agryzkov on 16.06.2016.
 */
public class test {

    public static void main(String[] args) {
        String str = "a" ;
        int lengthWord = 0;
        int startPos = 0;
        int endPos = 0;
        String word = new String();
        for ( int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == ' ' )
            { if ( endPos-startPos+1 < lengthWord) { endPos = i - 1;
                startPos = i - lengthWord;
            }
                lengthWord = 0;
            }
            else lengthWord++;
        }
        if ( lengthWord != 0 ) { if ( endPos - startPos +1 < lengthWord ) { word = str.substring( str.length() - lengthWord ); } }
        else { word = str.substring( startPos, endPos + 1 ); }
        System.out.println(word);
    }
}
