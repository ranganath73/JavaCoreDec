/**
 * This program is written using the ternary operator, 
 * but it's not clear what it does. We think that the 
 * code will become much clearer if we get rid of the ternary operator.
 * 
 * Rewrite the program without using the ternary operator.
 * 
 * Requirements:
 * •	The program should read a number from the keyboard.
 * •	Instead of a ternary operator, the program should use an if statement.
 * •	The functionality of the program must not change.
 */


import java.util.Scanner;

/* 
The hard way...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number < 5 ? "The number is less than 5": number > 5 ? "The number is greater than 5": "The number is equal to 5";
        System.out.println(result);
    }
}
