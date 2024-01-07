/**
 * The public static toHex(String) method must convert the integer received 
 * as an input parameter from the decimal numeral system to hexadecimal and 
 * return its string representation.
 *
 * And conversely, the public static toDecimal(String) method converts from 
 * the string representation of a hexadecimal number to the string representation 
 * of a decimal number.
 *
 * The methods only work with positive numbers and non-empty strings.
 * If the input parameter is less than or equal to 0, the toHex(int) method returns an empty string.
 * If the input parameter is an empty string or null, then the toDecimal(String) method returns 0.
 * 
 * Your task is to implement these methods. 
 * 
 * Also the Solution class has a HEX constant, which contains all the characters used in the 
 * hexadecimal system.
 *
 * One algorithm for converting a decimal number to hexadecimal is as follows:
 *
 * while (the decimal number is not 0) {
 * the hexadecimal representation = the character in the HEX string that has an index equal to the remainder of the decimal number divided by 16
 * + the hexadecimal representation of the number
 * the decimal number = the decimal number / 16
 * }
 * 
 * One algorithm for converting a hexadecimal number to decimal is as follows:
 *
 *
 * for (int i = 0; i < length of the input string; i++) {
 * the decimal number = 16 * the decimal number + the index of the character in the HEX string that is equal to the character in the input string at index i
 * }
 * 
 * The main() method is not involved in testing.
 * 
 * Requirements:
 * •	The toHex(int) method needs to be implemented as outlined in the task conditions.
 * •	The toDecimal(String) method needs to be implemented as outlined in the task conditions.
 * •	The Integer.toHexString(int) and Long.toHexString(int) methods cannot be used.
 * •	The Integer.parseInt(String, int) and Long.parseLong(String, int) methods cannot be used.
 * •	 The Integer.toString(int, int) and Long.toString(long, int) methods cannot be used.
 * •	You cannot use a BigInteger object.
 * •	You cannot use a BigDecimal object.
 */

package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //write your code here
        return null;
    }

    public static int toDecimal(String hexNumber) {
        //write your code here
        return 0;
    }
}


// public class Solution {
//     private static final String HEX = "0123456789abcdef";

//     public static void main(String[] args) {
//         int decimalNumber = 1256;
//         System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
//         String hexNumber = "4e8";
//         System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
//     }

//     public static String toHex(int decimalNumber) {
//         String hexNumber = "";
//         if (decimalNumber <= 0)
//         {
//             return hexNumber;
//         }
//         while (decimalNumber != 0)
//         {
//             hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
//             decimalNumber = decimalNumber / 16;
//         }
//         return hexNumber;
//     }

//     public static int toDecimal(String hexNumber) {
//         int decimalNumber = 0;
//         if (hexNumber == null)
//         {
//             return decimalNumber;
//         }
//         for (int i = 0; i < hexNumber.length(); i++) {
//             decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
//         }
//         return decimalNumber;
//     }
// }
