/**
 * The equal(String, String) method compares strings by reference using the == operator.
 * You need to make the method return true if the values (contents) of the strings are the same, 
 * and false if they are different, without using the equals() method.
 *
 * Requirements:
 * •	You need the equal(String, String) method to compare strings by value, 
 *      but using the == operator.
 * •	You need the equal(String, String) method to return true if the strings are the same.
 * •	The equal(String, String) method needs to return false if the strings are different.
 * •	You must not use the equals() method
 */

package en.codegym.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("CodeGym");
        String second = new String("CodeGym");
        String third = new String("codegym");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //write your code here
        return false;
    }
}




// public class Solution {
//     public static void main(String[] args) {
//         String first = new String("CodeGym");
//         String second = new String("CodeGym");
//         String third = new String("codegym");
//         System.out.println(equal(first, second));
//         System.out.println(equal(second, third));
//     }

//     public static boolean equal(String first, String second) {
//         return first.intern() == second.intern();
//     }
// }