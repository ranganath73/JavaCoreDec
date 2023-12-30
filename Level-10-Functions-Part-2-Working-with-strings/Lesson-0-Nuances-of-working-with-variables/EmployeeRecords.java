/**
 * Here you have in front of you a digital employee record. 
 * It contains the employee's name, position and salary.
 * The name of the employee is unlikely to change, but his or her position and salary might.
 * These changes are made using the setPosition() and setSalary() methods. 
 * Of course, they are not working correctly at present.
 *
 * Figure out the reason and fix the bugs. In doing this, neither the names of instance variables, 
 * nor the names of method parameters can be changed.
 *
 * Requirements:
 * •	The setPosition() method must set the passed value to the position instance variable.
 * •	The setSalary() method must set the passed value to the salary instance variable.
 * •	You cannot change the names of the instance variables.
 * •	You cannot change the names of method parameters.
 */

/* 
Employee records
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        position = position;
    }

    public void setSalary(int salary) {
        salary = salary;
    }
}
