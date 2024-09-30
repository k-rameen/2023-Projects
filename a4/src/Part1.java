/*
Rameen Khan
March 6, 2023
A4
*/

import java.util.*;

public class Part1 {
    public static void main ( String[] args ) {

        //Scans user input
        Scanner scan = new Scanner(System.in);
        //Variable for what the user selects
        int selection = 0;

        Jam goose = new Jam( "Gooseberry", "7/4/86", 120 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 80 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 30 );

        Pantry hubbard = new Pantry( goose, apple, rhub );

        System.out.println("\nWelcome to Mother Hubbard's Pantry!");

        //while loop for repeating the program until -1 is entered
        while (true) {

            System.out.println("\nThe jams are: \n" + hubbard);

            System.out.println("Enter your selection (1, 2, or 3): ");
            selection = scan.nextInt();

            // Check if selection is out of range
            if (selection >= 4 || selection <= -2 || selection == 0) {
                System.out.println("Out of range! Select a number between 1 and 3.");
                continue;  // Ask for input again
            }

            // If the selection is -1, exit the program
            if (selection == -1) {
                System.out.println("Good-by");
                break;
            }

            // If valid selection, proceed
            if (selection >= 1 && selection <= 3) {
                hubbard.select(selection);  // Select the jam
                int amountToSpread = -1;

                // Loop to ensure valid amount to spread is entered
                while (amountToSpread < 0) {
                    System.out.println("Enter amount to spread: ");
                    amountToSpread = scan.nextInt();

                    if (amountToSpread < 0) {
                        System.out.println("Cannot spread negative amount.");
                    } else if (amountToSpread == 0) {
                        System.out.println("No amount is spread.");
                    } else {
                        hubbard.spread(amountToSpread);  // Spread the jam
                    }
                }
            }
        }
    }
}
