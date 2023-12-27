/**
 * Rename the parameters of the rintPersonInfo() method:
 *
 * firstName to name;
 * lastName to surname;
 * favoriteDish to meal;
 * without changing the program's functionality.
 * Leave the variable names in the main() method unchanged.
 *
 * Requirements:
 * •	The parameters of the printPersonInfo() method must be named name, surname, and meal.
 * •	The console output must match the task conditions.
 * •	In the main() method, the firstName, lastName, and favoriteDish should remain unchanged.
 */


/* 
Favorite dish
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String firstName, String lastName, String favouriteDish) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Favorite dish: " + favouriteDish);
    }

}
