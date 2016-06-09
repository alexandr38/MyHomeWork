package week2;

/**
 * Created by Agryzkov on 09.06.2016.
 */
public class HomeWork5_array {

    /* Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
     */
    public int countEvens(int[] nums) {
        int countNum = 0;
        for ( int i = 0; i < nums.length; i++) {
            if ( nums[i]%2 == 0 )  countNum++ ;
        } ;
        return countNum ;
    }

    /* Return the sum of the numbers in the array, returning 0 for an empty array.
     Except the number 13 is very unlucky, so it does not count and numbers
     that come immediately after a 13 also do not count.
    sum13([1, 2, 2, 1]) ? 6
    sum13([1, 1]) ? 2
    sum13([1, 2, 2, 1, 13]) ? 6
    */
    public int sum13(int[] nums) {
        int not13Sum = 0 ;
        for (int i = 0; i < nums.length ; i++ ) {
            if ( nums[i] == 13 ) i+=1 ;
            else not13Sum += nums[i] ;
        }
        return not13Sum;
    }

    /* Given an array of ints, return true if the array contains no 1's and no 3's.
    lucky13([0, 2, 4]) ? true
    lucky13([1, 2, 3]) ? false
    lucky13([1, 2, 4]) ? false
    */
    public boolean lucky13(int[] nums) {
        boolean no13 = true ;
        for ( int i = 0; i < nums.length && no13 == true; i++) {
            if ( nums[i] == 1 || nums[i] == 3 ) no13 = false ;
        }
        return no13;
    }

    /* Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
     The given n may be 0, in which case just return a length 0 array. You do not need
     a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case,
     so it just works. The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
    fizzArray(4) ? [0, 1, 2, 3]
    fizzArray(1) ? [0]
    fizzArray(10) ? [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    */
    public int[] fizzArray(int n) {
        int[] array = new int[n] ;
        for ( int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array ;
    }

    /* Given an array of ints, return true if it contains no 1's or it contains no 4's.
    no14([1, 2, 3]) ? true
    no14([1, 2, 3, 4]) ? false
    no14([2, 3, 4]) ? true
       */
    public boolean no14(int[] nums) {
        boolean no1 = false ;
        boolean no4 = false ;
        for ( int i = 0; i < nums.length && (no1 == false || no4 == false); i++ ) {
            if ( nums[i] == 1 ) no1 = true ;
            else
            if ( nums[i] == 4 ) no4 = true ;
        }
        return !(no1 && no4) ;
    }

    /* Given arrays nums1 and nums2 of the same length, for every element in nums1,
    consider the corresponding element in nums2 (at the same index). Return the count
    of the number of times that the two elements differ by 2 or less, but are not equal.
    matchUp([1, 2, 3], [2, 3, 10]) → 2
    matchUp([1, 2, 3], [2, 3, 5]) → 3
    matchUp([1, 2, 3], [2, 3, 3]) → 2
     */
    


}
