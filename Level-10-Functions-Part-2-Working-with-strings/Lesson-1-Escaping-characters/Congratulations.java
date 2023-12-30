/**
 * Initialize the static variables with the following values:
 *
 * partyFace - "\uD83E\uDD73"
 * balloon - "\uD83C\uDF88"
 * gift - "\uD83C\uDF81"
 * partyPopper - "\uD83C\uDF89"
 * cake - "\uD83C\uDF82"
 * 
 * To see some congratulations, run the main() method.
 *
 * Requirements:
 * •	The partyFace variable must be initialized with the value "\uD83E\uDD73" when it is declared.
 * •	The balloon variable must be initialized with the value "\uD83C\uDF88" when it is declared.
 * •	The gift variable must be initialized with the value "\uD83C\uDF81" when it is declared.
 * •	The partyPopper variable must be initialized with the value "\uD83C\uDF89" when it is declared.
 * •	The cake variable must be initialized with the value "\uD83C\uDF82" when it is declared.
 */

/* 
Congratulations
*/

public class Solution {
    public static String partyFace = "";
    public static String balloon = "";
    public static String gift = "";
    public static String partyPopper = "";
    public static String cake = "";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "Happy birthday!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
