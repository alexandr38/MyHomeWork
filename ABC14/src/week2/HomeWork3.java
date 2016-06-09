package week2;

/**
 * Created by Agryzkov on 09.06.2016.
 */
public class HomeWork3 {

    /* Given an array of ints, return true if 6 appears as either the first
    or last element in the array. The array will be length 1 or more.
     */
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length -1] == 6 ;
    }

    /*Given 2 arrays of ints, a and b, return true if they have
    the same first element or they have the same last element.
    Both arrays will be length 1 or more.
     */
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1] ;
    }

    /* Given an array of ints length 3, return a new array with the elements
     in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
      */
    public int[] reverse3(int[] nums) {

        int[] revers = new int[nums.length];
        for ( int countNum = nums.length -1, countRev = 0;
              countNum >= 0; countNum--, countRev++ ) {
            revers[countRev] = nums[countNum];
        }
        return revers ;
    }

    /* Given 2 int arrays, a and b, each length 3,
    return a new array length 2 containing their middle elements.
     */
    public int[] middleWay(int[] a, int[] b) {
        int[] resArr = {a[1], b[1]};
        return resArr;
    }

    /* Given an int array length 2,
     return true if it does not contain a 2 or 3.
      */
    public boolean no23(int[] nums) {
        boolean not23 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                i = nums.length ;
                not23 = false;
            }
        }
        return not23;
    }

    /* Given an int array length 3, if there is a 2 in the array
    immediately followed by a 3, set the 3 element to 0.
    Return the changed array.
     */
    public int[] fix23(int[] nums) {
        for ( int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 3) {
                nums[i+1] = 0;
            }
        }
        return nums;
    }

    /* Given an array of ints of even length, return a new array
    length 2 containing the middle two elements from the original array.
    The original array will be length 2 or more.
    makeMiddle([1, 2, 3, 4]) ? [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) ? [2, 3]
    makeMiddle([1, 2]) ? [1, 2]
     */
    public int[] makeMiddle(int[] nums) {
        int[] resArr = { nums[nums.length/2 - 1], nums[nums.length/2] } ;
        return  resArr ;
    }

    /* Given an array of ints of odd length, return a new array length 3
    containing the elements from the middle of the array.
    The array length will be at least 3.

    midThree([1, 2, 3, 4, 5]) ? [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) ? [7, 5, 3]
    midThree([1, 2, 3]) ? [1, 2, 3]
    */
    public int[] midThree(int[] nums) {
        int[] resArr = { nums[nums.length/2 - 1], nums[nums.length/2],nums[nums.length/2 + 1] } ;
        return  resArr ;
    }

    /* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
     Return true if the given array contains an unlucky 1
     in the first 2 or last 2 positions in the array.

    unlucky1([1, 3, 4, 5]) ? true
    unlucky1([2, 1, 3, 4, 5]) ? true
    unlucky1([1, 1, 1]) ? false
    */
    // test-ok, [11] - ??
    public boolean unlucky1(int[] nums) {
        if (nums.length > 1) {
            if ( nums[0] == 1 && nums[1] == 3 ||
                    nums[1] == 1 && nums[2] == 3 ||
                    nums[nums.length-2] == 1 && nums[nums.length-1] == 3 ) {
                return true ;
            }
        }
        return false ;
    }

}
