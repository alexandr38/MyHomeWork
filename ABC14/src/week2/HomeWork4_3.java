package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

// copy second array into first array
public class HomeWork4_3 {

    public static void main(String[] args) {
        // random Size of Array
        int randomSize = (int) (Math.random() * 100);
        // create arrays
        int[] firstArray = MyArrayUtil.createIntArray(randomSize);
        int[] secondArray = MyArrayUtil.createIntArray(randomSize);
        // print arrays
        MyArrayUtil.printArray(firstArray);
        MyArrayUtil.printArray(secondArray);
        // copy array
        MyArrayUtil.copyArray( firstArray, secondArray ) ;
        // print result first array
        MyArrayUtil.printArray( firstArray );
    }
}
