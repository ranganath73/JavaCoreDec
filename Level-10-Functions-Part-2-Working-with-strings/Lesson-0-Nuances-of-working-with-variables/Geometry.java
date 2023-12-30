/**
 * Take a look at what the program does. 
 * Add the final modifier to standard constants (variables with immutable values).
 * 
 * Requirements:
 * •	The final modifier must be set on all constants.
 */

/* 
Remembering geometry
*/

public class Solution {
    public static double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("The area of the circle is: " + pi * radius * radius);
        System.out.println("The perimeter of the circle is: " + pi * diameter);
    }
}
