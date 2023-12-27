/**
 * The printSqrt(int[] array) method should print the square root of each element in the passed array.
 * But this isn't happening due to conflicting variable names. 
 * Correct the variable names so that the code compiles.
 * 
 * The program should display a suitable line on the console for each element of the array.
 * 
 * Example of a line:
 * The square root of 64 is 8.0
 *
 * Requirements:
 * •	The code must compile.
 * •	For each element in the array, the printSqrt(int[] array) method must print a string 
 *      in accordance with the task conditions.
 */

/* 
Everything has a root
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "The square root of ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " is " + elementSqrt);
        }
    }
}
