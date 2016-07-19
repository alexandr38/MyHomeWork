package week4;

import java.util.Map;

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
}
