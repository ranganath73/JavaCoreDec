/**
 * We have a program that reads two numbers from the keyboard and displays the larger of them. 
 * If the numbers are the same, then display either one.
 * 
 * Rewrite the program using the ternary operator without changing its functionality.
 * 
 * Requirements:
 * •	The program should read two number from the keyboard.
 * •	Instead of the if-else statement in the program, you need to use the ternary operator.
 * •	The functionality of the program must not change.
 */


import java.util.Scanner;

/* 
Looking for the maximum
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }
    }
}
