/*
CellPhoneService

In a file called CellPhoneService.java, create an application that prompts the user for the max monthly amount they need for talking minutes, text messages and gigabytes of data.
Display a recommendation of the best plan for the users needs.
A user who needs less than 500 minutes, and no text messages or data should buy (Plan A at R150 per month).
A user who needs less than 500 minutes and any text messages should buy (Plan B at R210 per month).
A user who needs 500 or more minutes and no data should buy either (Plan C for up to 100 text messages at R90 per month) or (Plan D for 100 text messages or more at R115 per month).
A use who needs any data should buy (Plan E for up to 3 gigabytes at R 150 per month) or (Plan F for 3 gigabytes or more at R230 per month).
*/
import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        // Array of available plans
        String[] options = {
                "Plan A: less than 500 minutes, and no text messages or data at R150 per month",
                "Plan B: less than 500 minutes and any text messages at R210 per month",
                "Plan C: 500 or more minutes and no data at R90 per month",
                "Plan D: 100 text messages or more at R115 per month",
                "Plan E: 3 gigabytes data at R150 per month",
                "Plan F: 3 gigabytes data or more at R230 per month"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, Welcome to our Cell Phone Services\n\nHere are our available monthly plans:\n");
        for (String option: options){
            System.out.println(option);
        }

        int choices = 0, price = 0;
        String choice = "";

        do {
            System.out.print("\nChoose a plan (1-6) for (Plan A - Plan F) respectively: ");
            if (scanner.hasNextInt()) {
                choices = scanner.nextInt();
                if (choices >= 1 && choices <= 6) {
                    // Valid choice, process it
                    price = switch (choices) {
                        case 1 -> {
                            choice = options[0];
                            yield 150;
                        }
                        case 2 -> {
                            choice = options[1];
                            yield 210;
                        }
                        case 3 -> {
                            choice = options[2];
                            yield 90;
                        }
                        case 4 -> {
                            choice = options[3];
                            yield 115;
                        }
                        case 5 -> {
                            choice = options[4];
                            yield 150;
                        }
                        case 6 -> {
                            choice = options[5];
                            yield 230;
                        }
                        default -> price;
                    };
                } else {
                    // Invalid choice, inform the user
                    System.out.println("Invalid choice. Please select a plan between 1 and 6.");
                }
            } else {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.next(); // Clear the invalid input
            }
        } while (choices < 1 || choices > 6); // Repeat until a valid choice is made

        // Display the selected plan and price
        System.out.println("You chose " + choice);
        System.out.println("The price is R" + price + " per month. Enjoy!\n\nThank You for visiting our services!");

        // Close the scanner
        scanner.close();
    }
}