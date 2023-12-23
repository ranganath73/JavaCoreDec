/**
 * Implement the main(String[]) method, which needs to copy the contents of 
 * the firstArray and secondArray arrays into one resultArray array.
 * 
 * The firstArray array must be at the beginning of the new resultArray array, 
 * followed by the secondArray array.
 *
 * Requirements:
 * •	The Solution class must have a public static int[] firstArray variable initialized 
 *      with an array with 10 values.
 * •	The Solution class must have a public static int[] secondArray variable initialized 
 *      with an array with 10 values.
 * •	The Solution class must have a public static int[] resultArray variable.
 * •	Implement the main(String[]) method in accordance with the task conditions.
 */

/* 
Combining arrays
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
