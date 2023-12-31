/**
 * The public static toOctal(int) method must convert the integer received as 
 * an input parameter from the decimal numeral system into octal. And conversely, 
 * the public static toDecimal(int) method converts from the octal system into decimal.
 * 
 * The methods only work with positive numbers. If the input parameter is less than or equal to 0, 
 * the methods return 0.
 * 
 * Your task is to implement these methods.
 *
 * One algorithm for converting a decimal number to octal is as follows:
 *
 * i is equal to 0
 * while (the decimal number is not 0) {
 * the octal number = the octal number + (remainder of the division of the decimal number by 8) * 10 to the power of i
 * the decimal number = the decimal number / 8
 * increase i by 1
 * }
 * 
 * One algorithm for converting an octal number to decimal is as follows:
 *
 * i is equal to 0
 * while (the octal number is not 0) {
 * the decimal number = the decimal number + (remainder of the division of the octal number by 10) * 8 to the power of i
 * the octal number = the octal number / 10
 * increase i by 1
 * }
 * 
 * The main() method is not involved in testing.
 *
 * Hint: You can use the Math.pow(number, degree) method to raise a number to a power.
 *
 * Requirements:
 * •	The toOctal(int) method needs to be implemented as outlined in the task conditions.
 * •	The toDecimal(int) method needs to be implemented as outlined in the task conditions.
 * •	The Integer.toOctalString(int) and Long.toOctalString(int) methods cannot be used.
 * •	The Integer.parseInt(String, int) and Long.parseLong(String, int) methods cannot be used.
 * •	The Integer.toString(int, int) and Long.toString(long, int) methods cannot be used.
 * •	You cannot use a BigInteger object.
 * •	You cannot use a BigDecimal object.
 */

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //write your code here
        return 0;
    }

    public static int toDecimal(int octalNumber) {
        //write your code here
        return 0;
    }
}
