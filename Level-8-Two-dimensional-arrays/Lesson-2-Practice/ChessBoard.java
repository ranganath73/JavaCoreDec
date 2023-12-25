/**
 * Let's create a program to generate square chessboards with a given dimension.
 * In the Solution class, you have a two-dimensional array of characters (the array field). 
 * 
 * Requirements:
 * 
 * Read a number from the keyboard. This will be the dimension of our board (the length of a side);
 * Initialize the array variable with the appropriate value;
 * "Paint" the array to obtain a checkerboard pattern (black cells - '#', white - ' '). Start the pattern by putting a '#' in the top left corner of the array;
 * Display the array on the screen as in the example (each row on a separate line).
 * 
 * Example output for number 5:
 * # # #
 *  # # 
 * # # #
 *  # # 
 * # # #
 *
 * Requirements:
 * •	The program needs to read a number from the keyboard.
 * •	The array field must be initialized with an appropriately-sized array.
 * •	The array must be filled as outlined in the task conditions.
 * •	The program needs to display the elements of the array on the screen 
 *      (see the example in the task conditions).
 */

import java.util.Scanner;

/* 
Chess board
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
//         array = new char[n][n];
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 if (( i + j ) % 2 == 0) {
//                     array[i][j] = '#';
//                 } else {
//                     array[i][j] = ' ';
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
