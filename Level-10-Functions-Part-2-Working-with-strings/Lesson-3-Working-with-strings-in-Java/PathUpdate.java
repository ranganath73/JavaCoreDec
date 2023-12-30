/**
 * Implement the changePath(String, String) method so that it 
 * replaces the jdk version in the path passed in the first method parameter 
 * with the version passed in the second parameter, and returns the new path.
 *
 * The JDK version starts with "jdk" and ends at "/".
 *
 * Example:
 * path - "/usr/java/jdk1.8/bin"
 * JDK version - "jdk-13"
 * 
 * The changePath(path, JDK version) method should return the path "/usr/java/jdk-13/bin".
 *
 * The main() method is not involved in testing.
 *
 * Requirements:
 * •	The changePath(String, String) method needs to be implemented as outlined in the 
 *      task conditions.
 */

/* 
Path update
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //write your code here
        return null;
    }
}

// public class Solution {
//     public static void main(String[] args) {
//         String path = "/usr/java/jdk1.8/bin";

//         String jdk13 = "jdk-13";
//         System.out.println(changePath(path, jdk13));
//     }

//     public static String changePath(String path, String jdk) {
//         int firstIndex = path.indexOf("jdk");
//         int lastIndex = path.indexOf("/", firstIndex);
//         String oldJdk = path.substring(firstIndex, lastIndex);
// //        path.replaceFirst("jdk1.8", jdk);
//         return path.replace(oldJdk, jdk);
//     }
// }