/**
 * Initialize the MULTIPLICATION_TABLE array as a new int[10][10], 
 * fill it with a multiplication table, and then display it on the 
 * console in the following form: 1 2 3 4 …
 * 
 * 2 4 6 8 …
 * 3 6 9 12 …
 * 4 8 12 16 …
 * …
 *
 * The numbers in each line are separated by a space.
 * 
 * Requirements:
 * •	In the main method, the MULTIPLICATION_TABLE array must be filled with a multiplication table.
 * •	The displayed text should contain 10 lines.
 * •	Each displayed line should contain 10 numbers separated by a space.
 * •	The displayed numbers must form a multiplication table.
 */


/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //write your code here
    }
}

// public class Solution {

//     public static int[][] MULTIPLICATION_TABLE;

//     public static void main(String[] args) {
//         MULTIPLICATION_TABLE = new int[10][10];
//         for (int i = 1; i <= 10; i++)
//         {
//             for (int j = 1; j <= 10; j++)
//             {
//                 MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
//                 System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
