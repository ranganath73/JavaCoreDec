/**
 * Four public character fields are declared in the Solution class. 
 * Some values have been assigned to them.
 *
 * The program doesn't compile. You need to fix this without changing the character values. 
 * All the fields are static — this is necessary in order to access them in the main() method.
 * You can see the result by running the main() method. It is not involved in testing.
 *
 * Requirements:
 * •	The first variable needs to be assigned the value '\u004A'.
 * •	The second variable needs to be assigned the value 'a'.
 * •	The third variable needs to be assigned the value '\u0076'.
 * •	The fourth variable needs to be assigned the value 'a'.
 */

/* 
Character literals
*/

public class Solution {
    public static char first = 'u004A';
    public static char second = a;
    public static char third = "\u0076";
    public static char fourth = {a};

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
