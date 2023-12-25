/**
 * You are given a two-dimensional array that is 5x6. 
 * Using only the fill method of the Arrays class, 
 * fill the array with 'X' characters (uppercase X) and ' ' (space) as shown in the following example:
 * 
 * XXXXXX
 * X    X
 * X    X
 * X    X
 * XXXXXX
 *
 * Do not use loops to solve this task.
 *
 * Requirements:
 * •	The Solution class must have a public static char[][] array field 
 *      initialized with a new char[5][6].
 * •	The array must be filled as outlined in the task conditions.
 * •	The program must use the fill method of the Arrays class.
 */


import java.io.IOException;
import java.util.Arrays;

/* 
Rectangle
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        //write your code here
    }
}


// public class Solution {
//     public static char[][] array = new char[5][6];

//     public static void main(String[] args) throws IOException {
//         Arrays.fill(array[0], 'X');
//         Arrays.fill(array[1], 'X');
//         Arrays.fill(array[1], 1, 5, ' ');
//         Arrays.fill(array[2], 'X');
//         Arrays.fill(array[2], 1, 5, ' ');
//         Arrays.fill(array[3], 'X');
//         Arrays.fill(array[3], 1, 5, ' ');
//         Arrays.fill(array[4], 'X');
//     }
// }
