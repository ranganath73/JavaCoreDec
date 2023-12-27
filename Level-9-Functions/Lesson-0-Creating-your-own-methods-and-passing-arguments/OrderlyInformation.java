/**
 * Here is a bad example of using methods:
 *
 * The methods split up a couplet.
 * It's not worth it to wrap a single line of code in a separate method.
 * Rewrite the code so that all text is displayed in the main method, 
 * and the rest of the methods are removed.
 * 
 * The execution of the program should not change.
 *
 * Requirements:
 * •	The main() method should be the only method in the Solution class.
 * •	The console output must match the task conditions.
 */

package en.codegym.task.pro.task06.task0602;

/* 
Orderly information
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        print1();
        print2();
    }

    public static void print1() {
        System.out.println("For sweetest things turn sourest by their deeds;");
    }

    public static void print2() {
        System.out.println("Lilies that fester smell far worse than weeds.");
    }
}
