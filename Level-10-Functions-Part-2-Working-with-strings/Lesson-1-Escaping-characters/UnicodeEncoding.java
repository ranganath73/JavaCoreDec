/**
 * The public static init(char[]) method is passed an array of 9 characters, 
 * which needs to be filled with the following values:
 *
 * 0 - '\u00A9'
 * 1 - '\u004A'
 * 2 - '\u0061'
 * 3 - '\u0076'
 * 4 - '\u0061'
 * 5 - '\u0052'
 * 6 - '\u0075'
 * 7 - '\u0073' 
 * 8 - '\u0068'
 * 
 * To see the result, run the main() method.
 *
 * Requirements:
 * •	The init(char[]) method needs to fill the received char array in 
 *      accordance with the task conditions.
 */

/* 
Unicode encoding
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //write your code here
    }
}
