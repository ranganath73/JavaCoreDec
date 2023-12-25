/**
 * A two-dimensional array is an array of arrays. 
 * That is, an array where each cell holds a reference to an array.
 * But it is much easier to think of it as a table that has a number of rows (first dimension) 
 * and a number of columns (second dimension).
 * In this task, we will create such an array.
 *
 * Implement the main(String[]) method, which:
 * 
 * Reads from the console a number R — the number of rows in the array. 
 * The number must be greater than 0.
 * 
 * Then it reads R numbers from the console (any numbers greater than 0).
 * Then it initializes the two-dimensional multiArray array using:
 * the number of rows R;
 * row arrays whose size corresponds to the numbers entered in step 2 (in the order they are entered).
 * 
 * Example:
 *
 * The number 5 is entered.
 * The numbers 1, 7, 5, 9, and 3 are entered.
 * And we get an array like this:
 * []
 * [][][][][][][]
 * [][][][][]
 * [][][][][][][][][]
 * [][][]
 * 
 * Requirements:
 * •	The Solution class should have an uninitialized public static int[][] multiArray variable.
 * •	The main(String[]) method must read N+1 numbers from the keyboard.
 * •	In the main(String[]) method, initialize and fill the two-dimensional 
 *      array as outlined in the task conditions.
 */

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //write your code here
    }
}



// public class Solution {
//     public static int[][] multiArray;

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int r = scan.nextInt();
//         multiArray = new int[r][];
//         for (int i = 0; i < r; i++)
//         {
//             int c = scan.nextInt();
//             multiArray[i] = new int[c];
//         }
//     }
// }
