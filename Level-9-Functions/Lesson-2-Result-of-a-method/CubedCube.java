/**
 * You won't blow any minds by unveiling a calculator that can raise a number to the power of three.
 * But a calculator that can raise a number to the power of nine is another matter! 
 * So let's implement one!
 *
 * To do this, create a public static long ninthDegree(long) method.
 * It must take a long integer value as an argument.
 * The method should raise the passed value to the ninth power and return it as the method's result.
 * You'll remember from your high school math class that you can get the ninth power of a number 
 * if you raise it to the third power and then raise the result to the third power. 
 * Let's use this rule in our program.
 * 
 * In the ninthDegree() method, raise the passed argument to the third power using the cube() method.
 * Then pass the result to the cube() method once again. The final result is the method's return value.
 *
 * Requirements:
 * •	There must be a public static long ninthDegree(long a) method.
 * •	The ninthDegree() method must return the result of raising the passed number to the 
 *      power of nine.
 * •	The ninthDegree() method must use the cube() method to successively cube the number.
 */

/* 
A cubed cube calculator
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    //write your code here
}
