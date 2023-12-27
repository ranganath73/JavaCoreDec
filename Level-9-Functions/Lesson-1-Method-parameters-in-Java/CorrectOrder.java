/**
 * Let's write a utility for working with arrays. 
 * The main functionality is ready: the printArray() method 
 * displays all the elements of the array on the console.
 * What is left for you is just a trifle: implement the reverseArray() method. 
 * It should reverse the order of the elements in the array.
 * The method should only work with arrays of integer values (int[]).
 *
 * Example:
 * If the array contains the elements:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
 * then after calling the reverseArray() method it should contain:
 * 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
 *
 * Requirements:
 * •	The reverseArray() method must reverse the order of the elements in the array.
 */


/* 
Correct order
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //write your code here
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}


    // public static void reverseArray(int[] array) {
    //     for (int i = 0; i < array.length / 2; i++) {
    //         int temp = array[i];
    //         array[i] = array[array.length - i - 1];
    //         array[array.length - i - 1] = temp;
    //     }
    // }
