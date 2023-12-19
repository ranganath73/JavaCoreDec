/**
 * In the main method, write the code for a pairwise comparison by reference of the string1, 
 * string2 and string3 strings and display a corresponding message after each comparison:
 * 
 * "The references to the strings are the same" or "The references to the strings are different".
 * 
 * The order of comparisons should be as follows:
 * - string1 and string2
 * - string1 and string3
 * - string2 and string3
 * 
 * Requirements:
 * •	The string1, string2, and string3 fields and their values cannot be changed.
 * •	The main method should compare the string1 and string2 strings by reference.
 * •	The main method should compare the string2 and string3 strings by reference.
 * •	The main method should compare the string1 and string3 strings by reference.
 * •	The program should display the appropriate messages on the screen.
 * •	The program should display 3 lin
 */


public class Solution {
    public static String string1 = "Amigo";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "The references to the strings are the same";
        String different = "The references to the strings are different";
        //write your code here
        System.out.println(same);
        System.out.println(different);
    }
}
