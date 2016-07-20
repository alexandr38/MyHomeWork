package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by sasha on 19.07.2016.
 */
public class MyMap {

    /*      Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have
     *  that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value of "a".
     *     mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}
     *     mapBully({"a": "candy"}) → {"b": "candy", "a": ""}
     *     mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}
     */
    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.get("a") != null){
            map.put("b", map.get("a"));
            map.put("a","");
        }
        return map;
        }

    /*      Given a map of food keys and topping values, modify and return the map as follows: if the key
    *  "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
    *    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    *    topping1({}) → {"bread": "butter"}
    *    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
    */
    public Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread","butter");
        return map;
    }

    /*      Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
     * In all cases remove the key "c", leaving the rest of the map unchanged.
     *   mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) → {"b": "aaa", "a": "aaa"}
     *   mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
     *   mapShare({"d": "hi", "c": "meh", "a": "aaa"}) → {"d": "hi", "b": "aaa", "a": "aaa"}
     */
    public Map<String, String> mapShare(Map<String, String> map) {

        if (map.get("a") != null){
            map.put("b", map.get("a"));
        }
        map.remove("c");

        return map;
    }

    /*      Given a map of food keys and their topping values, modify and return the map as follows:
     * if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
     * If the key "spinach" has a value, change that value to "nuts".
     *   topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
     *   topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
     *   topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */
    public Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }

    /*      Modify and return the given map as follows: for this problem the map may or may not contain
     * the "a" and "b" keys. If both keys are present, append their 2 string values together and store the
     * result under the key "ab".
     *   mapAB({"b": "There", "a": "Hi"}) → {"b": "There", "a": "Hi", "ab": "HiThere"}
     *   mapAB({"a": "Hi"}) → {"a": "Hi"}
     *   mapAB({"b": "There"}) → {"b": "There"}
     */
    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    /*      Given a map of food keys and topping values, modify and return the map as follows:
     * if the key "potato" has a value, set that as the value for the key "fries".
     * If the key "salad" has a value, set that as the value for the key "spinach".
     *
     * topping3({"potato": "ketchup"}) → {"fries": "ketchup", "potato": "ketchup"}
     * topping3({"potato": "butter"}) → {"fries": "butter", "potato": "butter"}
     * topping3({"salad": "oil", "potato": "ketchup"}) → {"salad": "oil", "fries": "ketchup", "spinach": "oil", "potato": "ketchup"}
     */
    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    /*      Given an array of strings, return a Map<String, Integer> containing a key for every different string
     * in the array, always with the value 0. For example the string "hello" makes the pair "hello":0.
     * We'll do more complicated counting later, but for this problem the value is simply 0.
     *   word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
     *   word0(["a", "b", "a", "c", "b"]) → {"b": 0, "c": 0, "a": 0}
     *   word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
     */
    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        if (strings.length > 0) {
            map.put(strings[0], 0);
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], 0);
                }
            }
        }
        return map;
    }

    /*      The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for
     *  each different string, with the value the number of times that string appears in the array.
     *   wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
     *   wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
     *   wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        if (strings.length > 0){
            map.put(strings[0], 1);
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], 1);
                } else
                    map.put(strings[i], map.get(strings[i]) + 1);
            }
        }
        return map;
    }

    /*      Given an array of strings, return a Map<String, Boolean> where each different string is a key
     * and value is true only if that string appears 2 or more times in the array.
     *   wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
     *   wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
     *   wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<String, Boolean>();

        if (strings.length > 0){
            map.put(strings[0], false);
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], false);
                } else
                    map.put(strings[i],true);
            }
        }
        return map;
    }

    /*      Given an array of strings, return a Map<String, Integer> containing a key for every different string
     * in the array, and the value is that string's length.
     *       wordLen(["a", "bb", "a", "bb"]) → {"a": 1, "bb": 2}
     *       wordLen(["this", "and", "that", "and"]) → {"that": 4, "this": 4, "and": 3}
     *       wordLen(["code", "code", "code", "bug"]) → {"bug": 3, "code": 4}
     */
    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        if (strings.length > 0){
            map.put(strings[0], strings[0].length());
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], strings[i].length());
                }
            }
        }
        return map;
    }

    /*      Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
     * with the value of all the strings starting with that character appended together in the order they appear in the array.
     *       firstChar(["salt", "tea", "soda", "toast"]) → {"t": "teatoast", "s": "saltsoda"}
     *       firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"d": "d", "b": "bb", "c": "cccCC", "a": "aaaAA"}
     *       firstChar([]) → {}
     */
    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<String, String>();

        if (strings.length > 0){
            map.put(String.valueOf(strings[0].charAt(0)), strings[0]);
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(String.valueOf(strings[i].charAt(0)))) {
                    map.put(String.valueOf(strings[i].charAt(0)), strings[i]);
                } else
                    map.put(String.valueOf(strings[i].charAt(0)), map.get(String.valueOf(strings[i].charAt(0))) + strings[i]);
            }
        }
        return map;
    }

    /*      We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
     * return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
     * swap the 2 strings in the array. When a position in the arrays has been swapped, it no longer matches anything.
     * Using a map, this can be solved making just one pass over the array. More difficult than it looks.
     *       allSwap(["ab", "ac"]) → ["ac", "ab"]
     *       allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
     *       allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */
    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        if (strings.length > 0 ){
            for (int i = 0; i < strings.length; i++){
                if (!strings[i].isEmpty()){
                    if (map.containsKey(String.valueOf(strings[i].charAt(0)))){
                        String buff = strings[map.get(String.valueOf(strings[i].charAt(0)))];
                        strings[map.get(String.valueOf(strings[i].charAt(0)))] = strings[i];
                        strings[i] = buff;
                        map.remove(String.valueOf(strings[i].charAt(0)));
                    } else
                        map.put(String.valueOf(strings[i].charAt(0)), i);
                }
            }
        }
        return strings;
    }

    /*      Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
     * there is a key of its first character with the value of its last character.
     *       pairs(["code", "bug"]) → {"b": "g", "c": "e"}
     *       pairs(["man", "moon", "main"]) → {"m": "n"}
     *       pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}
     */
    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<String, String>();

        if (strings.length > 0){
            for (int i = 0; i < strings.length; i++){
                if (!strings[i].isEmpty()){
                    map.put(String.valueOf(strings[i].charAt(0)), strings[i].substring(strings[i].length() - 1));
                }
            }
        }
        return map;
    }

    /*      Loop over the given array of strings to build a result string like this: when a string appears the 2nd,
     *  4th, 6th, etc. time in the array, append the string to the result. Return the empty string
     * no string appears a 2nd time.
     *       wordAppend(["a", "b", "a"]) → "a"
     *       wordAppend(["a", "", "a"]) → "a"
     *       wordAppend([]) → ""
     */
    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        String result = "";

        for (String key : strings){
            if (map.containsKey(key)){
                result += key;
                map.remove(key);
            } else
                map.put(key, 1);
        }
        return result;
    }

    /*      We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and
     * then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
     * swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap,
     * its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult
     * than it looks.
     *   firstSwap(["ab", "ac"]) → ["ac", "ab"]
     *   firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
     *   firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
     */
    public String[] firstSwap(String[] strings) {

        if (strings.length > 0){

            Map<String, Integer> map = new HashMap<String, Integer>();

            for (int i = 0; i < strings.length; i++){
                if (!strings[i].isEmpty()){
                    if (map.containsKey(String.valueOf(strings[i].charAt(0)))){
                        if (map.get(String.valueOf(strings[i].charAt(0))) != -1){
                            String buff = strings[map.get(String.valueOf(strings[i].charAt(0)))];
                            strings[map.get(String.valueOf(strings[i].charAt(0)))] = strings[i];
                            strings[i] = buff;
                            map.put(String.valueOf(strings[i].charAt(0)), -1);
                        }
                    } else
                        map.put(String.valueOf(strings[i].charAt(0)), i);
                }
            }
        }
        return strings;
    }
}
