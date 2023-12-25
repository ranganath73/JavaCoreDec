/**
 * The Solution class contains a two-dimensional 3x3 array of numbers (array field). Requirements:
 *
 * Fill this array, row by row, with numbers read from the keyboard.
 * Reflect (transpose) the array about the main diagonal (the main diagonal is the set of cells for which i == j).
 * Display the flipped array on the screen as in the example (each row on a separate line, and each element of a row separated by a space).
 * Examples of transposing an array
 * 
 * Original array:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * Array reflected about the main diagonal:
 * 1 4 7
 * 2 5 8
 * 3 6 9
 *
 * Requirements:
 * •	The program needs to read 9 numbers from the keyboard.
 * •	The array needs to be flipped with respect to the main diagonal.
 * •	The program needs to display the elements of the array in accordance with the task conditions.
 */


import java.util.Scanner;

/* 
What a reflection!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //write your code here
    }
}


// public class Solution {
//     public static int[][] array = new int[3][3];

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         for (int i = 0; i < array.length; i++)
//         {
//             for (int j = 0; j < array[0].length; j++) {
//                 array[i][j] = scan.nextInt();
//             }
//         }
//         for (int i = 0; i < array.length; i++) {
//             for (int j = i + 1; j < array[0].length; j++) {
//                 int temp = array[i][j];
//                 array[i][j] = array[j][i];
//                 array[j][i] = temp;
//             }
//         }
//         for (int i = 0; i < array.length; i++)
//         {
//             for (int j = 0; j < array[0].length; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }