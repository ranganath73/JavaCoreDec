/**
 * Using a StringTokenizer, split the query variable into parts based on the delimiter variable.
 * The maximum possible number of tokens is 6.
 *
 * Example:
 * getTokens("java.util.stream", "\\.") returns the string array {"java", "util", "stream"}
 *
 * Requirements:
 * •	The getTokens(String, String) method needs to use a StringTokenizer.
 * •	The getTokens(String, String) method needs to return a String array filled 
 *      in accordance with the task conditions.
 */

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //write your code here
        return null;
    }
}



// public class Solution {
//     public static void main(String[] args) {
//         String packagePath = "java.util.stream";
//         String[] tokens = getTokens(packagePath, "\\.");
//         System.out.println(Arrays.toString(tokens));
//     }

//     public static String[] getTokens(String query, String delimiter) {
//         StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
//         String[] tokenArray = new String[tokenizer.countTokens()];
//         int i = 0;
//         while (tokenizer.hasMoreTokens())
//         {
//             tokenArray[i++] = tokenizer.nextToken();
//         }
//         return tokenArray;
//     }
// }
