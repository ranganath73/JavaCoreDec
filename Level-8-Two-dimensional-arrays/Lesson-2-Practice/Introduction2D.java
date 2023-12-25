/**
 * In the Solution class, initialize the array field with a two-dimensional 
 * integer array whose dimensions are 2x3.
 * 
 * In the main method, fill the array with (non-zero) integers and display it on the screen.
 * 
 * Requirements:
 * •	The array field of the Solution class must be initialized with a two-dimensional integer array whose dimensions are 2x3.
 * •	This array must be filled with any integers other than 0.
 * •	The program needs to display the elements of the array, each element on a new line.
 */

/* 
Introducing a two-dimensional array
*/

public class Solution {
    public static int[][] array;//write your code here

    public static void main(String[] args) {
        array = new int[2][3];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = 1 + i + j;
                System.out.println(array[i][j]);
            }
        }
    }
}
