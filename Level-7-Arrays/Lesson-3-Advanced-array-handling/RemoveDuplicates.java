/**
 * In this task, you need to:
 *
 * Read 6 strings and fill the strings array with them.
 * Remove duplicate strings from the strings array, 
 * replacing them with null (null, not the string "null").
 * 
 * Examples:
 * The array after reading the strings:
 * {"Hello", "Hello", "World", "Java", "Tasks", "World"}
 *
 * The array after removing duplicate strings:
 * {null, null, null, "Java", "Tasks", null}
 * 
 * Requirements:
 * •	In the main(String[]) method, read 6 strings from the keyboard and fill 
 *      the strings array with them.
 * •	In the main(String[]) method, remove (meaning, overwrite with null) any 
 *      duplicated elements in the strings array.
 */


import java.util.Scanner;

/* 
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

// public class Solution {
//     public static String[] strings;

//     public static void main(String[] args) {
//         strings = new String[6];
//         Scanner scan = new Scanner(System.in);
//         for (int i = 0; i < strings.length; i++)
//         {
//             strings[i] = scan.nextLine();
//         }
//         for (int i = 0; i < strings.length; i++)
//         {
//             String currentString = strings[i];
//             for (int j = i + 1; j < strings.length; j++)
//             {
//                 if (currentString == null)
//                 {
//                     break;
//                 }
//                 if (currentString.equals(strings[j]))
//                 {
//                     strings[j] = null;
//                     strings[i] = null;
//                 }
//             }
//         }
//         for (int i = 0; i < strings.length; i++) {
//             System.out.print(strings[i] + ", ");
//         }
//     }
// }
