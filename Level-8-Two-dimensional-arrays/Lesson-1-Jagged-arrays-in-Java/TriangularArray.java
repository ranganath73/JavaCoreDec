/**
 * Create a triangular array where the value of each element is the sum of its indices.
 *
 * For example:
 * array[7][3] = 7 + 3 = 10,
 * array[3][0] = 3 + 0 = 3.
 *
 * Display the array in the following form:
 * 0
 * 1 2
 * 2 3 4
 * 3 4 5 6
 * 4 5 6 7 8
 * 5 6 7 8 9 10
 * ...
 * 
 * The numbers in each line are separated by a space.
 * You can define a triangular array as follows:
 * int[][] array = new int[10][];
 * array[0] = new int[1];
 * array[1] = new int[2];
 * array[2] = new int[3];
 * ...
 * 
 * Requirements:
 * •	In the main(String[]) method, fill the two-dimensional result array with numbers 
 *      as outlined in the task conditions.
 * •	The displayed text should contain 10 lines.
 * •	The displayed numbers must match the task conditions.
 */


/* 
Triangular array
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //write your code here
    }
}


// public class Solution {

//     public static int[][] result = new int[10][];

//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++)
//         {
//             result[i] = new int[i + 1];
//         }
//         for (int i = 0; i < 10; i++)
//         {
//             for (int j = 0; j <= i; j++)
//             {
//                 result[i][j] = i + j;
//                 System.out.print(result[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }