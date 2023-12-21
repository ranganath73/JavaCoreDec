/**
 * In this task, you need to:
 *
 * Read integers from the keyboard until something else is entered, 
 * such as a string or a character.
 * At least two numbers must be entered. If less than two integers are entered, 
 * then terminate the program with an error. You don't need to handle this situation.
 * Display the second smallest integer entered from the keyboard. 
 * If several such numbers are entered, you must display any of them.
 * There may also be several minimum numbers.
 *
 * Example input:
 * 8
 * 4 // Minimum number
 * 7
 * 4 // Minimum number
 * 5 // Second smallest number
 * 9
 * 5 // Second smallest number
 * exit
 * Example output:
 * 5
 *
 * Requirements:
 * •	The program should read numbers from the keyboard.
 * •	The program should display a number on the screen.
 * •	The program should display the second smallest integer entered.
 * •	If several second smallest numbers are entered, then you need to display any one of them.
 * •	You need to read data from the keyboard in a while loop.
 */


import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

    }
}

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int min = Integer.MAX_VALUE;
//         int secondMin = Integer.MAX_VALUE;
//         while (scan.hasNextInt())
//         {
//             int tmp = scan.nextInt();
//             if (tmp < min)
//             {
//                 secondMin = min;
//                 min = tmp;
//             } 
//             else if (tmp > min && tmp < secondMin) 
//             {
//                 secondMin = tmp;
//             }
//         }
//         System.out.println(secondMin);
//     }
// }