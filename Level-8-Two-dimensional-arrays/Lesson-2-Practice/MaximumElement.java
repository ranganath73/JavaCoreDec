/**
 * The Solution class contains a two-dimensional 3x3 array of numbers (array field). 
 * In the main method, you need to fill the array, row by row, with data read from 
 * the keyboard and display the maximum element of the array.
 * 
 * Requirements:
 * •	The program needs to read 9 numbers from the keyboard.
 * •	The array variable must be filled with numbers read from the keyboard.
 * •	The program needs to display the maximum element of the array on the screen.
 */

import java.util.Scanner;

/* 
Maximum element
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
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < array.length; i++)
//         {
//             for (int j = 0; j < array[i].length; j++)
//             {
//                 array[i][j] = scan.nextInt();
//                 if (array[i][j] > max)
//                 {
//                     max = array[i][j];
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }
