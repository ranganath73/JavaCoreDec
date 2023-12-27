/**
 * The main method prints too many lines of information about various concepts.
 * It would make sense to separate displaying information about hydrogen from 
 * displaying information about the island of Java by separating them into different methods.
 *
 * Create a public static void printHydrogenInfo() method, which should 
 * print all the lines about hydrogen.
 * Also, create a public static void printJavaInfo() method, which should 
 * print all the lines about the island of Java.
 * 
 * Finally, in the main() method, call these two methods.
 *
 * The general console output shouldn't change.
 *
 * Requirements:
 * •	There must be a public static void printHydrogenInfo() method.
 * •	There must be a public static void printJavaInfo() method.
 * •	The printHydrogenInfo() method should print all existing lines about hydrogen.
 * •	The printJavaInfo() method should print all existing lines about the island of Java.
 * •	The main() method must call the printHydrogenInfo() and printJavaInfo() methods.
 * •	The general console output shouldn't change.
 */

package en.codegym.task.pro.task06.task0601;

/* 
Separate concepts
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hydrogen:");
        System.out.println("This is a chemical element in the periodic table. Its designation is H, and its atomic number is 1.");
        System.out.println("It is the lightest element in the table.");
        System.out.println("Hydrogen is used in:");
        System.out.println("- the chemical industry");
        System.out.println("- the oil refining industry");
        System.out.println("- aviation");
        System.out.println("- power generation.");

        System.out.println("Island of Java:");
        System.out.println("It is part of Indonesia.");
        System.out.println("The states of Mataram, Majapahit, and Demak originated on the island.");
        System.out.println("Java is the most populated island in the world:");
        System.out.println("The total population is 140 million people.");
        System.out.println("The population density is 1,061 people per square kilometer.");
        System.out.println("Kopi luwak, a famous variety of coffee, is produced here.");
    }

    //write your code here
}
