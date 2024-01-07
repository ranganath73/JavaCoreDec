/**
 * Implement the main(String[]) method, which splits an array into two subarrays 
 * and fills a two-dimensional result array with them.
 * 
 * If the length of the array is odd, then the larger half should be 
 * copied into the first subarray.
 *
 * Use the Arrays.copyOfRange(int[], int, int) method to split the array. 
 * Do not change the order of the elements.
 * 
 * During testing, the values of the fields in the Solution class will be different. 
 * Take that into consideration.
 *
 * Requirements:
 * •	Implement the main(String[]) method in accordance with the task conditions.
 */

import java.util.Arrays;

/* 
Splitting an array
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //write your code here
        System.out.println(Arrays.deepToString(result));
    }
}
