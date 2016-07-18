package week4;

/**
 * Created by Agryzkov on 18.07.2016.
 */
public class Recursion_1 {

    // factorial without variable
    public int factorial(int n) {

        if (n == 1){return 1;}
        return factorial(n-1)*n;
    }

    /*
    * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    *    bunnyEars2(0) ? 0
    *   bunnyEars2(1) ? 2
    *  bunnyEars2(2) ? 5
    */
    public int bunnyEars2(int bunnies) {

        if (bunnies == 0) {return 0;}
        else { if (bunnies%2 == 0){
                    return bunnyEars2(bunnies - 1) + 3;
                } else {return bunnyEars2(bunnies - 1) + 2;}
        }
    }

    /*  Given a non-negative int n, return the count of the occurrences of 7 as a digit,
    * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    *    count7(717) ? 2
    *   count7(7) ? 1
    *  count7(123) ? 0
    */

    public int count7(int n) {

        if (n < 10 && n == 7) {
            return 1;
        } else if (n < 10 && !(n == 7)) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else return count7(n / 10);
    }

    /* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     *   countX("xxhixx") ? 4
     *   countX("xhixhix") ? 3
     *   countX("hi") ? 0
     */
    public int countX(String str) {

        switch (str.length()){
            case 0:
                return 0;

            case 1:
                if (str.charAt(0) == 'x'){
                    return 1;
                } else return 0;

            default:
                if (str.charAt(0) == 'x'){
                    return 1 + countX(str.substring(1));
                } else return countX(str.substring(1));
        }
    }

    /* Given a string, compute recursively (no loops) a new string where all appearances
    * of "pi" have been replaced by "3.14".
    *    changePi("xpix") ? "x3.14x"
    *    changePi("pipi") ? "3.143.14"
    *    changePi("pip") ? "3.14p"
    */
    public String changePi(String str) {

        if (str.length() < 2) {
            return str;
        } else if (str.length() == 2 && str.equals("pi")){
            return "3.14";
        } else if (str.length() == 2 && !str.equals("pi")){
            return str;
        } else if (str.substring(0,2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        } else
            return str.substring(0,1) + changePi(str.substring(1));
    }

    /* Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
    * We'll use the convention of considering only the part of the array that begins at the given index.
    * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    *   array11([1, 2, 11], 0) ? 1
    *    array11([11, 11], 0) ? 2
    *    array11([1, 2, 3, 4], 0) ? 0
    */
    public int array11(int[] nums, int index) {

        if (nums.length == 0){
            return 0;
        } else if (nums.length - 1 < index){
            return 0;
        } else if (nums[index] == 11){
            return 1 + array11(nums, index + 1);
        } else return array11(nums, index + 1);
    }

    /* Given a string, compute recursively a new string where identical chars that are adjacent in the original string
     * are separated from each other by a "*".
     *   pairStar("hello") ? "hel*lo"
     *   pairStar("xxyy") ? "x*xy*y"
     *   pairStar("aaaa") ? "a*a*a*a"
     */
    public String pairStar(String str) {

        if(str.length() < 2){
            return str;
        } else if (str.charAt(0) == str.charAt(1)){
            return str.substring(0,1) + '*' + pairStar(str.substring(1));
        } else return str.substring(0,1) + pairStar(str.substring(1));
    }

    /* Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
     *   countAbc("abc") ? 1
     *   countAbc("abcxxabc") ? 2
     *   countAbc("abaxxaba") ? 2
     */
    public int countAbc(String str) {

        if (str.length() < 3){
            return 0;
        } else if (str.substring(0,2).equals("ab") && (str.charAt(2) == 'a' || str.charAt(2) == 'c')){
            return 1 + countAbc(str.substring(2));
        } else return countAbc(str.substring(1));
    }

    /* Given a string, compute recursively the number of times lowercase "hi" appears in the string,
     * however do not count "hi" that have an 'x' immedately before them.
     *   countHi2("ahixhi") ? 1
     *   countHi2("ahibhi") ? 2
     *   countHi2("xhixhi") ? 0
     */
    public int countHi2(String str) {

        if (str.length() < 2){
            return 0;
        } else if (str.length() == 2 && str.equals("hi")){
            return 1;
        } else if (str.length() == 2 && !str.equals("hi")){
            return 0;
        } else if (str.substring(0,2).equals("hi")){
            return 1 + countHi2(str.substring(2));
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i'){
            return countHi2(str.substring(3));
        } else return countHi2(str.substring(1));

    }

    /* Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
     * without the sub strings overlapping.
     *   strCount("catcowcat", "cat") → 2
     *   strCount("catcowcat", "cow") → 1
     *   strCount("catcowcat", "dog") → 0
     */
    public int strCount(String str, String sub) {

        if (str.length() == 0 ||
                (str.length() < sub.length())){
            return 0;
        } else if (str.substring(0,sub.length()).equals(sub)){
            return 1 + strCount(str.substring(sub.length()), sub);
        } else return strCount(str.substring(1), sub);

    }

    /* We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number
     *   of ears across all the bunnies recursively (without loops or multiplication).
     *   bunnyEars(0) → 0
     *   bunnyEars(1) → 2
     *   bunnyEars(2) → 4
     */
    public int bunnyEars(int bunnies) {

        if (bunnies == 0){
            return 0;
        } else return 2 + bunnyEars(bunnies - 1);
    }

    /* We have triangle made of blocks. The topmost row has 1 block,
     * the next row down has 2 blocks, the next row has 3 blocks, and so on.
     * Compute recursively (no loops or multiplication) the total number of blocks in such a triangle
     * with the given number of rows.
     *   triangle(0) → 0
     *   triangle(1) → 1
     *   triangle(2) → 3
     */
    public int triangle(int rows) {

        if (rows == 0){
            return  0;
        } else return rows + triangle(rows - 1);
    }

    /* Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
     * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
     * the rightmost digit (126 / 10 is 12).
     *   count8(8) → 1
     *   count8(818) → 2
     *   count8(8818) → 4
     */
    public int count8(int n) {

        if (n < 10 && n == 8) {
            return 1;
        } else if (n < 10 && !(n == 8)) {
            return 0;
        } else if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n / 10);
        } if (n % 10 == 8){
            return 1 + count8(n / 10);
        } else return count8(n / 10);
    }

    /* Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     *   countHi("xxhixx") → 1
     *   countHi("xhixhix") → 2
     *   countHi("hi") → 1
     */
    public int countHi(String str) {

        if (str.length() < 2){
            return 0;
        } else if (str.charAt(0) == 'h' && str.charAt(1) == 'i'){
            return 1 + countHi(str.substring(2));
        } else return countHi(str.substring(1));
    }

    /* Given a string, compute recursively a new string where all the 'x' chars have been removed.
     *   noX("xaxb") → "ab"
     *   noX("abc") → "abc"
     *   noX("xx") → ""
     */
    public String noX(String str) {

        if (str.length() == 0){
            return str;
        } else if (str.charAt(0) == 'x'){
            return str = noX(str.substring(1));
        } else return str = str.substring(0,1) + noX(str.substring(1));
    }

    /* Given an array of ints, compute recursively if the array contains somewhere a value followed
     * in the array by that value times 10. We'll use the convention of considering only the part of the
     * array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array.
     * The initial call will pass in index as 0.
     *   array220([1, 2, 20], 0) → true
     *   array220([3, 30], 0) → true
     *   array220([3], 0) → false
     */
    public boolean array220(int[] nums, int index) {
        return false;
    }

    /* Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved
     * to the end of the string.
     *   endX("xxre") → "rexx"
     *   endX("xxhixx") → "hixxxx"
     *   endX("xhixhix") → "hihixxx"
     */
    public String endX(String str) {

        if (str.length() < 2){
            return str;
        } else if (str.charAt(0) == 'x'){
            return str = endX(str.substring(1)) + 'x';
        } else return str = str.substring(0,1) + endX(str.substring(1));
    }

    /* Given a string, compute recursively (no loops) the number of "11" substrings in the string.
     *  The "11" substrings should not overlap.
     *   count11("11abc11") → 2
     *   count11("abc11x11x11") → 3
     *   count11("111") → 1
     */
    public int count11(String str) {

        if (str.length() < 2){
            return 0;
        } else if (str.charAt(0) == '1' && str.charAt(1) == '1'){
            return 1 + count11(str.substring(2));
        } else return count11(str.substring(1));
    }

    /* Given a string that contains a single pair of parenthesis, compute recursively
     * a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
     *       parenBit("xyz(abc)123") → "(abc)"
     *       parenBit("x(hello)") → "(hello)"
     *       parenBit("(xy)1") → "(xy)"
     */
    public String parenBit(String str) {

        return str;
    }

    /* Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear
     * in the string somewhere, possibly with overlapping. N will be non-negative.
     *   strCopies("catcowcat", "cat", 2) → true
     *   strCopies("catcowcat", "cow", 2) → false
     *   strCopies("catcowcat", "cow", 1) → true
     */
    public boolean strCopies(String str, String sub, int n) {

        return false;

    }






}
