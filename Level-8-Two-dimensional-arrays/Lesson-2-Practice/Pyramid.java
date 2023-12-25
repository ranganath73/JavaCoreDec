/**
 * Let's write a program that will draw a pyramid with a specified height.
 * In the Solution class, you have a two-dimensional array of characters (the array field). 
 * 
 * Requirements:
 *
 * Read a number from the keyboard. This will be the height of the pyramid.
 * Initialize the array variable with the appropriate value.
 * Fill the array in such a way as to form a pyramid — use '#' to fill the cells that 
 * make up the pyramid; use ' ' for the background. See the example below.
 * Display the array on the screen as in the example (each row on a separate line).
 * 
 * Example output for number 5:
 *     #    
 *    ###   
 *   #####  
 *  ####### 
 * #########
 *
 * Requirements:
 * •	The program needs to read a number from the keyboard.
 * •	The array field must be initialized with an appropriately-sized array.
 * •	The array must be filled as outlined in the task conditions.
 * •	The program needs to display the elements of the array on the 
 *      screen (see the example in the task conditions).
 */

import java.util.Scanner;

/* 
Pyramid
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //write your code here
    }
}


// public class Solution {
//     public static char[][] array;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         array = new char[n][2 * n - 1];
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 if (j < array.length - i - 1 || j > array[0].length - array.length + i) {
//                     array[i][j] = ' ';
//                 } else  {
//                     array[i][j] = '#';
//                 }
//             }
//         }
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 System.out.print(array[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }