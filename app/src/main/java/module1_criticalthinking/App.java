/*
-------------------------------------------
 Program Name: Critical Thinking Assignment module 1
 Author: Mahmoud Kassab
 Date: Feb 15, 2026
-------------------------------------------
 Pseudocode: 
    1. Start the program
    2. Declare and initialize variables for first name, last name, street address, city, and zip code
        a. First name: String
        b. Last name: String
        c. Street address: String
        d. City: String
        e. Zip code: String
    3. Assign appropriate values to each variable
        a. First name: "John"
        b. Last name: "Battle"
        c. Street address: "2990 Cook Hill Road"
        d. City: "Stamford"
        e. State: "CT"
        f. Zip code: "06903"
    4. Print the first name, last name, street address, city, state, and zip code to the console on a separate line
        a. print "First Name: " + first name
        b. print "Last Name: " + last name
        c. print "Street Address: " + street address
        d. print "City: " + city
        e. print "State: " + state
        f. print "Zip Code: " + zip code
    5. End the program
-------------------------------------------
 Program Inputs: None, all variable are hardcoded in the program
 Program Outputs: First name, Last name, Street address, City, Zip code
-------------------------------------------
"""
 */
package module1_criticalthinking;

public class App {

    public static void main(String[] args) {
        //assign appropriate values to each variable
        String firstName = "John";
        String lastName = "Battle";
        String address = "2990 Cook Hill Road";
        String city = "Stamford";
        String state = "CT";
        String zipCode = "06903";
        
        // print name and address each on a separate line
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);

    }
}
