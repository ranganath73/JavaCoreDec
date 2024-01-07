/**
 * You need to implement 2 methods using a StringBuilder: 
 * addTo(String, String[]) and replace(String, String, int, int).
 *
 * The addTo(String, String[]) method adds to the string received as the first parameter, 
 * in order, all the strings in the array of strings received as the second parameter 
 * and returns a StringBuilder object based this cumulative string.
 * 
 * To add a new value to an existing StringBuilder object, 
 * you need to call its append(String) method and pass the new value to it.
 *
 * The replace(String, String, int, int) method replaces the part of the string 
 * received as the first parameter, starting at the index received as the third parameter 
 * and ending with the index received as the fourth parameter, with the string received 
 * as the second parameter, and returns a StringBuilder based on this modified string.
 * 
 * To replace part of the value of a StringBuilder object, 
 * you need to call its replace(int, int, String) method, 
 * passing in the starting and ending replacement indices, as well as the new value.
 *
 * Requirements:
 * •	The addTo(String, String[]) method needs to be implemented as outlined in the task conditions.
 * •	The replace(String, String, int, int) method needs to be implemented as 
 *      outlined in the task conditions.
 */

/* 
Let's work with StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //write your code here
        return null;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //write your code here
        return null;
    }
}



// public class Solution {
//     public static void main(String[] args) {
//         String string = "Learn, learn, and learn again! ";

//         System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
//         System.out.println(replace(string, ", ", 16, 27));
//     }

//     public static StringBuilder addTo(String string, String[] strings) {
//         StringBuilder sb = new StringBuilder(string);
//         for (String s : strings)
//         {
//             sb.append(s);
//         }
//         return sb;
//     }

//     public static StringBuilder replace(String string, String str, int start, int end) {
//         StringBuilder sb = new StringBuilder(string);
//         return sb.replace(start, end, str);
//     }
// }