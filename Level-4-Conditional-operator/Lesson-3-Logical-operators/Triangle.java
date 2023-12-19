/**
 * Let's write a program that will calculate the possibility 
 * of the existence of a triangle based on the lengths of sides.
 * To do this, you need to:
 * 
 * Enter three numbers from the keyboard — the lengths of the sides of the assumed triangle.
 * Use the lengths of the sides to determine whether a triangle is possible.
 * Depending on the result, display "It's a triangle" or "It's not a triangle".
 * To make this determination, you need to compare each side with the sum of the other two sides.
 * 
 * That is, you will need to perform three comparisons:
 * 
 * If each comparison indicates that the side is less than the sum of the other two sides, 
 * then a triangle with these sides does exist.
 * 
 * If even one comparison indicates that the side is greater than or equal to the sum of 
 * the other two sides, then a triangle with these sides does not exist.
 * 
 * Requirements:
 * •	The program should read three number from the keyboard.
 * •	The program should display text on the screen in accordance with the task conditions.
 * •	If a triangle with the entered sides is possible, then you need to display "It's a triangle".
 * •	If a triangle with the entered sides is not possible, then you need to display 
 *      "It's not a triangle".
 */


import java.util.Scanner;

/* 
Triangle
*/

public class Triangle {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        //write your code here
    }
}
