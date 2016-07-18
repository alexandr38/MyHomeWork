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
    


}
