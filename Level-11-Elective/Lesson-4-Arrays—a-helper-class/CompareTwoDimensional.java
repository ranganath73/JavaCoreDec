/**
 * Fix the logic of the main(String[]) method. 
 * It should display true if arrayFirst is the same as arraySecond. 
 * Otherwise, it should return false.
 *
 * Requirements:
 * •	If arrayFirst is equal to arraySecond, then main(String[]) displays true on the console.
 * •	If arrayFirst is not equal to arraySecond, then main(String[]) displays false on the console.
 */

import java.util.Arrays;

/* 
Comparing two-dimensional arrays
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(arrayFirst == arraySecond);
    }
}
