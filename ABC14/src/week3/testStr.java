package week3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Agryzkov on 21.06.2016.
 */
public class testStr {

    public static void main(String[] args) {

        String s1 = "Test this is the test koko  ko test test abra Abra koko ";
        Set<String> words = new LinkedHashSet<String>();
        String[] s1Array = s1.toLowerCase().split(" ");
        words.addAll( Arrays.asList(s1Array) );
        String outputStr = String.valueOf(words);
        System.out.println( "rezult" + outputStr );


    }
}
