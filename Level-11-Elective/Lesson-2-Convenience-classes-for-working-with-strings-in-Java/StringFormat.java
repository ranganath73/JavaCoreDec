/**
 * Make the format(String name, int salary) method return a string like this:
 * My name is <name>. I will earn $<salary> a month.
 * 
 * Use the String.format() method to do this.
 * 
 * Requirements:
 * •	You need the format(String, int) method to use the String.format() method.
 * •	You need the format(String, int) method to return a string in accordance with the 
 *      task conditions.
 */

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "My name is . I will earn $ a month.";
        //write your code here
        return null;
    }
}


// public class Solution {
//     public static void main(String[] args) {
//         System.out.println(format("Amigo", 5000));
//     }

//     public static String format(String name, int salary) {
//         String phrase = "My name is %s. I will earn $%d a month.";
//         return String.format(phrase, name, salary);
//     }
// }
