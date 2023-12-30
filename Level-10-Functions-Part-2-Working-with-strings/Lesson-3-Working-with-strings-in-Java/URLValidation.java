/**
 * In this task, you need to perform URL validation.
 *
 * A simple URL scheme looks like this:
 * <network protocol>://<resource name>.<domain>
 *
 * The checkProtocol(String) method checks the network protocol (http or https) 
 * of the URL passed in input parameter and returns the result of this check — 
 * the name of the network protocol as a string.
 * 
 * And the checkDomainExtension(String) method checks the domain (com, net, org, or us) 
 * of the URL passed in the input parameter, and returns the result of the 
 * check — the domain extension as a string.
 *
 * If the URL does not start with http or https, then the result will be "unknown".
 * If the URL does not end with com, net, org, or us, the result is "unknown".
 * 
 * The main() method is not involved in testing.
 * 
 * Requirements:
 * •	The checkProtocol(String) method needs to be implemented as outlined in the task conditions.
 * •	The checkDomainExtension(String) method needs to be implemented as outlined in the task 
 *      conditions.
 */


/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        //write your code here
        return "unknown";
    }

    public static String checkDomainExtension(String url) {
        //write your code here
        return "unknown";
    }
}
