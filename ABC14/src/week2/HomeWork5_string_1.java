package week2;

/**
 * Created by Agryzkov on 10.06.2016.
 */
public class HomeWork5_string_1 {

    /* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") ? "Hello Bob!"
    helloName("Alice") ? "Hello Alice!"
    helloName("X") ? "Hello X!"
    */
    public String helloName(String name) {
        return "Hello " +name + '!' ;
    }

    /* Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string,
     e.g. "<<word>>". Note: use str.substring(i, j) to extract the
     String starting at index i and going up to but not including index j.
    makeOutWord("<<>>", "Yay") ? "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") ? "<<WooHoo>>"
    makeOutWord("[[]]", "word") ? "[[word]]"
    */
    public String makeOutWord(String out, String word) {
        String result = out.substring(0,2) + word + out.substring(2);
        return result ;
    }

    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") ? "Woo"
    firstHalf("HelloThere") ? "Hello"
    firstHalf("abcdef") ? "abc"
    */
    public String firstHalf(String str) {
        String startHalf = str.substring(0, str.length() / 2);
        return startHalf;
    }

    /* Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.
    nonStart("Hello", "There") ? "ellohere"
    nonStart("java", "code") ? "avaode"
    nonStart("shotl", "java") ? "hotlava"
    */
    public String nonStart(String a, String b) {
        String result = a.substring (1, a.length () ) + b.substring (1, b.length () ) ;
        return result ;
    }
    /* or
    public String nonStart(String a, String b) {
        String result = a.substring (1, a.length () ).concat( b.substring (1, b.length () ) ) ;
        return result ;
    }
    */

    /* Given a string, return a string length 1 from its front, unless front is false,
     in which case return a string length 1 from its back. The string will be non-empty.
    theEnd("Hello", true) ? "H"
    theEnd("Hello", false) ? "o"
    theEnd("oh", true) ? "o"
    */
    public String theEnd(String str, boolean front) {
        if ( front == true) return str.substring (0, 1) ;
        else return str.substring (str.length() - 1 );
    }

    /* Given a string, return true if it ends in "ly".
    endsLy("oddly") ? true
    endsLy("y") ? false
    endsLy("oddy") ? false
    */
    public boolean endsLy(String str) {
        if ( str.length() < 2 ) return false ;
        else
            return str.substring(str.length()-2).equals( "ly" ) ;
    }

    /* Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.
    middleThree("Candy") ? "and"
    middleThree("and") ? "and"
    middleThree("solving") ? "lvi"
    */
    public String middleThree(String str) {
        if ( str.length() < 4 ) return str ;
        else return str.substring( str.length()/2 - 1, str.length()/2 + 2 ) ;
    }

    /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
     so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    lastChars("last", "chars") ? "ls"
    lastChars("yo", "java") ? "ya"
    lastChars("hi", "") ? "h@"
    */
    public String lastChars(String a, String b) {
        String result = new String() ;
        if (a.length() == 0 ) result = result + '@' ;
        else result = result + a.charAt ( 0 ) ;
        if (b.length() == 0 ) result = result + '@' ;
        else result = result + b.charAt( b.length() - 1) ;
        return result ;
    }

    /* Given a string, if the string begins with "red" or "blue"
    return that color string, otherwise return the empty string.
    seeColor("redxx") ? "red"
    seeColor("xxred") ? ""
    seeColor("blueTimes") ? "blue"
    */
    public String seeColor(String str) {
        String result = new String() ;
        switch ( str.length() ) {
            case 0 :
            case 1 :
            case 2 :
                result = "" ;
                break ;
            case 3 :
                if (str.equals("red") ) result = "red" ;
                else result = "" ;
                break ;
            case 4 :
                if (str.equals("blue") ) result = "blue" ;
                else { if (str.substring(0, 3).equals("red") ) result = "red" ;
                else result = "" ; }
                break ;
            default :
                if (str.substring(0, 3).equals("red") )  result = "red" ;
                else { if (str.substring(0, 4).equals("blue") ) result = "blue" ;
                else result = "" ; }
                break ;
        }
        return result ;
    }

    /* Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
    extraFront("Hello") ? "HeHeHe"
    extraFront("ab") ? "ababab"
    extraFront("H") ? "HHH"
    */
    public String extraFront(String str) {
        String result = new String () ;
        switch ( str.length() ) {
            case 0 :
                break;
            case 1 :
            case 2 :
                result = str + str + str ;
                break ;
            default :
                result = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2) ;
                break ;
        }
        return result ;
    }
    
}
