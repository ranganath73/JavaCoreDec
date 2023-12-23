/**
 * In the main(String[]) method, you need to fill the strings array with values. 
 * If the array index is even, then assign the value "Even" (zero is an even number), 
 * otherwise assign "Odd".
 * 
 * The screen output is not tested.
 *
 * Requirements:
 * •	The Solution class must have a public static String[] strings variable initialized 
 *      with an array of 5 elements.
 * •	The main(String[]) method must fill the array according to the task conditions.
 */

package en.codegym.task.pro.task05.task0502;

/* 
Even and odd cells of an array
*/

public class Solution {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //write your code here

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
