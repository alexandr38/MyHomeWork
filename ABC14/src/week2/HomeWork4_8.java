package week2;

/**
 * Created by Agryzkov on 14.06.2016.
 */
public class HomeWork4_8 {
    /* There is two arrays of the same length arr1 and arr2.
    display array values in the console, which is the result of the sum arr1 [i] + arr2 [i]
     */
    public static void main(String[] args) {
        // create array
        int randomSize = 20 ;//(int) (Math.random() * 100) ;
        int[] firstArray = MyArrayUtil.createIntArray( randomSize ) ;
        int[] secondArray = MyArrayUtil.createIntArray( randomSize ) ;
        int[] sumArray = new int[randomSize] ;
        //the sum arr1 [i] + arr2 [i]
        for (int i = 0 ; i < randomSize ; i++ ) {
            sumArray[i] = firstArray[i] + secondArray[i] ;
        }
        MyArrayUtil.printArray( firstArray, 0 );
        MyArrayUtil.printArray( secondArray, 0 );
        System.out.println( " the sum arr1 [i] + arr2 [i] ");
        MyArrayUtil.printArray( sumArray, 0 );
    }
}
