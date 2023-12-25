/**
 * You are given a two-dimensional chars array In the main method, 
 * you need to replace all interior elements with a hyphen (minus sign).
 * Use the private printArray() method to display the contents of the array on the screen.
 *
 * Example array:
 * a b c d e f
 * j h i j k l
 * m n o p q r
 * s t u v w x
 * 
 * After running the program, the array should contain this:
 * a b c d e f
 * j - - - - l
 * m - - - - r
 * s t u v w x
 *
 * Requirements:
 * •	In the main method, replace all interior elements of the chars array with a hyphen 
 *      (see the example in the task conditions).
 */


/* 
Cutting down the middle
*/

public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        //write your code here

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


        // for (int i = 0; i < chars.length; i++) {
        //     for (int j = 0; j < chars[0].length; j++) {
        //         if (i != 0 && i != chars.length - 1 && j != 0 && j != chars[0].length -1) {
        //             chars[i][j] = '-';
        //         }
        //     }
        // }
