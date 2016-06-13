package week2;

/**
 * Created by Agryzkov on 13.06.2016.
 */

    /* create new random array. And search min cell and max cell
    in new array.
    */

public class HomeWork4_1 {

    public static void main(String[] args) {
        // random Size of Array
        int randomSize = (int) (Math.random() * 100) ;
        // create array
        int[] randomArray = MyArrayUtil.createIntArray( randomSize ) ;
        // print start array
        MyArrayUtil.printArray( randomArray );
        // search max cell
        int maxCell = MyArrayUtil.searchMaxCell( randomArray ) ;
        // search min cell
        int minCell = MyArrayUtil.searchMinCell( randomArray ) ;
        System.out.println( "max cell = " + maxCell + "    min cell = " + minCell );
    }
}
