/**
 * Implement a static main(String[]) method that populates the array variable 
 * with the values valueStart and valueEnd.
 * 
 * If the length of the array is even, then its first half must be filled with valueStart values, 
 * and the second half with valueEnd.
 * 
 * If the length of the array is odd, then fill the larger part with valueStart, 
 * and the smaller one with valueEnd.
 * 
 * To fill the array with values, use the Arrays.fill(int [], int, int, int) method.
 * During testing, the values of the fields in the Solution class will be different. 
 * Take that into consideration.
 * 
 * Requirements:
 * •	Implement the main(String[]) method in accordance with the task conditions.
 */

import java.util.Arrays;

/* 
Filling an array
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //write your code here
        System.out.println(Arrays.toString(array));
    }
}



// import java.util.Arrays;

// /* 
// Filling an array
// */

// public class Solution {
//     public static int[] array = new int[20];
//     public static int valueStart = 10;
//     public static int valueEnd = 13;

//     public static void main(String[] args) {
//         int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//         Arrays.fill(array, 0, firstPart, valueStart);
//         Arrays.fill(array, firstPart, array.length, valueEnd);
//         System.out.println(Arrays.toString(array));
//     }
// }
