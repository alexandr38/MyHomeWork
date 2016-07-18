package week4;

/**
 * Created by Agryzkov on 18.07.2016.
 */
public class Recursion_1 {

    // factorial - recursion
    public int factorial(int n) {

        int result = 0;
        if (n == 1){
            return 1;
        }
        result = factorial(n-1)*n;
        return result;
    }
    // ore without variable
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
    

}
