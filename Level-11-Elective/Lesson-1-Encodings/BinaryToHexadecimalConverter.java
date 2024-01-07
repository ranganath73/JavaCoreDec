/**
 * The public static toHex(String) method must convert the string representation 
 * of a binary number, received as an input parameter, 
 * from the binary numeral system to hexadecimal and return its string representation.
 * And conversely, the public static toBinary(String) method converts from the string 
 * representation of a hexadecimal number to the string representation of a binary number.
 * 
 * The methods only work with non-empty strings.
 * If the input parameter is an empty string or null, then both methods return an empty string.
 * If the input parameter of the toHex(String) method contains any character other than 0 or 1, 
 * then the method returns an empty string.
 * 
 * If the input parameter of the toBinary(String) method contains any character other than 
 * digits from 0 to 9 or lowercase Latin letters from a to f, then the method returns an empty string.
 *
 * Your task is to implement these methods.
 * 
 * One algorithm for converting the string representation of a binary number to the 
 * string representation of a hexadecimal number is as follows:
 *
 * We check the length of the string received in the input parameter. It must be a multiple of 4.
 * If this is not the case, then add the required number of 0s to the beginning of the string.
 * We take every four characters (bits) and check which hexadecimal character they correspond to.
 * 
 * For example:
 *
 * the binary representation is "100111010000", where "1001" is "9", "1101" is "d", and "0000" - "0"
 * the hexadecimal representation is "9d0". 
 * One algorithm for converting the string representation of a hexadecimal number to the 
 * string representationof a binary number is as follows:
 * 
 * We take each character and check which binary number (4 bits) it corresponds to.
 *
 * For example:
 *
 * the hexadecimal representation is "9d0", where "9" is "1001", "d" is "1101", and "0" is "0000"
 * the binary representation is "100111010000".
 * 
 * The main() method is not involved in testing.
 * 
 * Requirements:
 * •	The toHex(String) method needs to be implemented as outlined in the task conditions.
 * •	The toBinary(String) method needs to be implemented as outlined in the task conditions.
 * •	The Integer.toBinaryString(int) and Long.toBinaryString(int) methods cannot be used.
 * •	The Integer.toHexString(int) and Long.toHexString(int) methods cannot be used.
 * •	The Integer.parseInt(String, int) and Long.parseLong(String, int) methods cannot be used.
 * •	The Integer.toString(int, int) and Long.toString(long, int) methods cannot be used.
 * •	You cannot use a BigInteger object.
 * •	You cannot use a BigDecimal object.
 */

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //write your code here
        return null;
    }

    public static String toBinary(String hexNumber) {
        //write your code here
        return null;
    }
}




// /* 
// Binary to hexadecimal converter
// */

// public class Solution {
//     public static void main(String[] args) {
//         String binaryNumber = "100111010000";
//         System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
//         String hexNumber = "9d0";
//         System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
//     }

//     public static String toHex(String binaryNumber) {
//         String hexNumber = "";
//         if (binaryNumber == null) {
//             return hexNumber;
//         }

//         StringBuilder temp = new StringBuilder();
//         if (binaryNumber.length() % 4 == 1) {
//             temp.append("000").append(binaryNumber);
//         } else if (binaryNumber.length() % 4 == 2) {
//             temp.append("00").append(binaryNumber);
//         } else if (binaryNumber.length() % 4 == 3) {
//             temp.append("0").append(binaryNumber);
//         } else {
//             temp.append(binaryNumber);
//         }

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < temp.length(); i += 4) {
//             String substring = temp.substring(i, i + 4);
//             String element;
//             if (substring.equals("0001")) {
//                 element = "1";
//             } else if (substring.equals("0010")) {
//                 element = "2";
//             } else if (substring.equals("0011")) {
//                 element = "3";
//             } else if (substring.equals("0100")) {
//                 element = "4";
//             } else if (substring.equals("0101")) {
//                 element = "5";
//             } else if (substring.equals("0110")) {
//                 element = "6";
//             } else if (substring.equals("0111")) {
//                 element = "7";
//             } else if (substring.equals("1000")) {
//                 element = "8";
//             } else if (substring.equals("1001")) {
//                 element = "9";
//             } else if (substring.equals("1010")) {
//                 element = "a";
//             } else if (substring.equals("1011")) {
//                 element = "b";
//             } else if (substring.equals("1100")) {
//                 element = "c";
//             } else if (substring.equals("1101")) {
//                 element = "d";
//             } else if (substring.equals("1110")) {
//                 element = "e";
//             } else if (substring.equals("1111")) {
//                 element = "f";
//             } else {
//                 element = "0";
//             }
//             result.append(element);
//         }
//         return result.toString();
//     }

//     public static String toBinary(String hexNumber) {
//         String binaryNumber = "";
//         if (hexNumber == null) {
//             return binaryNumber;
//         }

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < hexNumber.length(); i++) {
//             String element;
//             if (hexNumber.charAt(i) == '0') {
//                 element = "0000";
//             } else if (hexNumber.charAt(i) == '1') {
//                 element = "0001";
//             } else if (hexNumber.charAt(i) == '2') {
//                 element = "0010";
//             } else if (hexNumber.charAt(i) == '3') {
//                 element = "0011";
//             } else if (hexNumber.charAt(i) == '4') {
//                 element = "0100";
//             } else if (hexNumber.charAt(i) == '5') {
//                 element = "0101";
//             } else if (hexNumber.charAt(i) == '6') {
//                 element = "0110";
//             } else if (hexNumber.charAt(i) == '7') {
//                 element = "0111";
//             } else if (hexNumber.charAt(i) == '8') {
//                 element = "1000";
//             } else if (hexNumber.charAt(i) == '9') {
//                 element = "1001";
//             } else if (hexNumber.charAt(i) == 'a') {
//                 element = "1010";
//             } else if (hexNumber.charAt(i) == 'b') {
//                 element = "1011";
//             } else if (hexNumber.charAt(i) == 'c') {
//                 element = "1100";
//             } else if (hexNumber.charAt(i) == 'd') {
//                 element = "1101";
//             } else if (hexNumber.charAt(i) == 'e') {
//                 element = "1110";
//             } else if (hexNumber.charAt(i) == 'f') {
//                 element = "1111";
//             } else {
//                 result.setLength(0);
//                 ;
//                 break;
//             }
//             result.append(element);
//         }
//         return result.toString();
//     }
// }
