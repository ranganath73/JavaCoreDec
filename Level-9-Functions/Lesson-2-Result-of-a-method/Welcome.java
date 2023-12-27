/**
 * This is the signIn() method that greets website users. 
 * Currently, it greets all users, but it should only greet registered users. 
 * All unregistered users have the name "user".
 * 
 * Add username validation at the beginning of the signIn() method.
 * If the name is "user", use the return keyword to abort execution of the method.
 *
 * Requirements:
 * •	If the username is "user", then the signIn() method should exit without printing anything on the console.
 * •	If the username is not "user", then the signIn() method should continue and print greetings on the console.
 * •	The return keyword must be used to interrupt the signIn() method.
 */

/* 
Welcome! But not everyone.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        //write your code here
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
