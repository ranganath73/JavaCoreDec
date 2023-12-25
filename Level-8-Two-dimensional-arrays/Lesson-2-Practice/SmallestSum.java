/**
 * The Solution class contains a two-dimensional 3x3 array of numbers (array field). 
 * In the main method, you need to fill this array, row by row, with data read from the keyboard, 
 * calculate the sum of the elements in each column and in each row, 
 * and then display the smallest of these sums on the screen.
 *
 * Requirements:
 * •	The program needs to read 9 numbers from the keyboard.
 * •	The array variable must be filled with numbers read from the keyboard.
 * •	The program needs to display the minimum sum of elements in any row or column.
 */

import java.util.Scanner;

/* 
Smallest sum
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //write your code here
    }
}



// import java.util.Scanner;

// /* 
// Smallest sum
// */

// public class Solution {
//     public static int[][] array = new int[3][3];

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         for (int i = 0; i < array.length; i++)
//         {
//             for (int j = 0; j < array[i].length; j++)
//             {
//                 array[i][j] = scan.nextInt();
//             }
//         }

//         int minSum = Integer.MAX_VALUE;

//         // row sum
//         for (int i = 0; i < array.length; i++)
//         {
//             int currentSum = array[0][i] + array[1][i] + array[2][i];
//             if (currentSum < minSum)
//             {
//                 minSum = currentSum;
//             }
//         }

//         // column sum
//         for (int i = 0; i < array.length; i++)
//         {
//             int currentSum = array[i][0] + array[i][1] + array[i][2];
//             if (currentSum < minSum)
//             {
//                 minSum = currentSum;
//             }
//         }
//         System.out.println(minSum);
//     }
// }
