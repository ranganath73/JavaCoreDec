/**
 * The getIndexOfFirstWord(String, String) method and the getIndexOfLastWord(String, String) 
 * method both accept a string and a word.
 *
 * The getIndexOfFirstWord(String, String) method needs to return the index of the 
 * first character of the first instance of the word (the second method parameter) 
 * in the string (the first method parameter).
 * 
 * And the getIndexOfLastWord(String, String) method needs to return the index of the 
 * first character of the last instance of the word (the second method parameter) in the 
 * string (the first method parameter).
 *
 * Example:
 * The string is "To become a programmer, you need to write code. 
 * To write code, you have to learn. To learn, you need desire."
 * The word is "code".
 *
 * getIndexOfFirstWord(string, word) method must return 42
 * getIndexOfLastWord(string, word) method must return 57
 *
 * The main() method is not involved in testing.
 *
 * Requirements:
 * •	You need to display the index of the first character of the 
 *      first instance of the word (the second method parameter) in the 
 *      string (the first method parameter).
 * •	You need to display the index of the first character of the 
 *      last instance of the word (the second method parameter) in the 
 *      string (the first method parameter).
 */

package en.codegym.task.pro.task09.task0913;

/* 
Searching in a string
*/

public class Solution {
    public static void main(String[] args) {
        String string = "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire.";
        String word = "code";
        int indexOfFirstWord = getIndexOfFirstWord(string, word);
        int indexOfLastWord = getIndexOfLastWord(string, word);
        System.out.println("The index of the first character of the first instance of the word \"" + word + "\" is " + indexOfFirstWord);
        System.out.println("The index of the first character of the last instance of the word \"" + word + "\" is " + indexOfLastWord);
    }

    public static int getIndexOfFirstWord(String string, String word) {
        //write your code here
        return 0;
    }

    public static int getIndexOfLastWord(String string, String word) {
        //write your code here
        return 0;
    }
}
