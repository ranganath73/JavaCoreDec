/**
 * The createCrew() method displays the positions and names of the crew members on a spacecraft.
 * To avoid any confusion inside the method, change the names of the createCrew() method's 
 * parameters to match the names of the variables passed to the method:
 * 
 * name1 to navigator
 * name2 to pilot
 * name3 in secondPilot
 * name4 to flightEngineer
 * 
 * And there should be no change to the execution of the program.
 * 
 * Requirements:
 * •	The createCrew() method's parameters must be named navigator, pilot, secondPilot, and 
 *      flightEngineer.
 * •	The console output must match the task conditions.
 * •	In the main() method, the navigator, pilot, secondPilot, and flightEngineer variables 
 *      should remain unchanged.
 */

/* 
The Liverpool 4
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String name1, String name2, String name3, String name4) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + name1);
        System.out.println("Pilot: " + name2);
        System.out.println("Second pilot: " + name3);
        System.out.println("Flight engineer:" + name4);
    }
}
