/**
 * The main method reads 3 integers from the keyboard: start, end, and multiple.
 * Update the program so that the screen displays the sum of all numbers in the range from start (inclusive) to end (not inclusive) that are evenly divisible by the multiple variable.
 * Use a for loop to do this.
 * 
 * Hint: To move to the next iteration of the loop, use a continue statement.
 *
 * Requirements:
 * •	The program should display the sum of all numbers in the range from start (inclusive) 
 *      to end (not inclusive) that are evenly divisible by the multiple variable.
 * •	The program must use a for loop.
 */

import java.util.Scanner;

/* 
Sum of even numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //write your code here

        System.out.println(sum);
    }
}