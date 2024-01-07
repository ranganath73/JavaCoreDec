/**
 * The public static toBinary(int) method must convert the integer 
 * received as an input parameter from the decimal numeral system to 
 * binary and return its string representation.
 * And conversely, the public static toDecimal(String) method converts 
 * from the string representation of a binary number to a decimal number.
 *
 * The methods only work with positive numbers and non-empty strings.
 * If the input parameter is less than or equal to 0, the toBinary(int) method returns an empty string.
 * If the input parameter is an empty string or null, then the toDecimal(String) method returns 0.
 *
 * Your task is to implement these methods.
 *
 * One algorithm for converting a decimal number to the string representation of a 
 * binary number is as follows:
 *
 * while (the decimal number is not 0) {
 * the binary representation = remainder of the division of the decimal number by 2 + the binary representation
 * the decimal number = the decimal number / 2
 * }
 * 
 * One algorithm for converting the string representation of a binary number to a decimal number is as follows:
 * 
 * for (int i = 0; i < length of the binary representation; i++) {
 * the decimal number = the decimal number + digit in the binary representation * 2 to the power of i
 * }
 * 
 * Initially, the rightmost number is taken from the binary representation.
 * With each iteration of the loop, we take the next number closer to the beginning of the 
 * binary representation.
 * Hint: You can use the Math.pow(number, degree) method to raise a number to a power.
 * The main() method is not involved in testing.
 *
 * Requirements:
 * •	The toBinary(int) method needs to be implemented as outlined in the task conditions.
 * •	The toDecimal(String) method needs to be implemented as outlined in the task conditions.
 * •	The Integer.toBinaryString(int) and Long.toBinaryString(int) methods cannot be used.
 * •	The Integer.parseInt(String, int) and Long.parseLong(String, int) methods cannot be used.
 * •	The Integer.toString(int, int) and Long.toString(long, int) methods cannot be used.
 * •	You cannot use a BigInteger object.
 * •	You cannot use a BigDecimal object.
 */


/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //write your code here
        return null;
    }

    public static int toDecimal(String binaryNumber) {
        //write your code here
        return 0;
    }
}



// public class Solution {
//     public static void main(String[] args) {
//         int decimalNumber = Integer.MAX_VALUE;
//         System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
//         String binaryNumber = "1111111111111111111111111111111";
//         System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
//     }

//     public static String toBinary(int decimalNumber) {
//         if (decimalNumber < 0)
//         {
//             return "";
//         }
//         String binaryNumber = "";
//         while (decimalNumber != 0)
//         {
//             binaryNumber = (decimalNumber % 2) + binaryNumber;
//             decimalNumber = decimalNumber / 2;
//         }
//         return binaryNumber;
//     }

//     public static int toDecimal(String binaryNumber) {
//         int decimalNumber = 0;
//         if (binaryNumber == null)
//         {
//             return decimalNumber;
//         }
//         for (int i = 0; i < binaryNumber.length(); i++) {
//               int index = binaryNumber.length() - 1 - i;
//               int value = Character.getNumericValue(binaryNumber.charAt(index));
//               decimalNumber += value * Math.pow(2, i);
//         }
//         return decimalNumber;
//     }
// }
