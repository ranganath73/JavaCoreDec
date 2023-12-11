/**
 * The main method displays four lines. Each of them are superb examples of abuse of capital letters.
 * Modify the code so that all the letters in these strings are lowercase.
 *
 * Requirements:
 * •	Do not change the values of the title, degree, and career variables.
 * •	You need to call the toLowerCase() method on the four strings passed to the println() method.
 * •	The program output must consist of four lines.
 */


/* 
Sprucing up your resume
*/

public class Solution {

    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //write your code here
        System.out.println("RESUME");
        System.out.println("TITLE: " + title);
        System.out.println("DEGREE: " + degree);
        System.out.println("CAREER: " + career);
    }
}
