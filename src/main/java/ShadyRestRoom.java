/*
ShadyRestRoom

In a file called ShadyRestRoom.java create an application that determines the price for a room.
Ask the user to choose 1 for a queen bed, 2 for a king bed or 3 for a king bed and pullout couch.
The output must reflect the input and the price of the room: R500 for a queen bed, R700 for king bed and R900 for a king bed and a pullout couch.
If the user inputs an invalid choice display a corresponding message and set the price to R0.
Now ask the user to specify 1 for a lake view or 2 for a park view, but only ask them if the bed size entry is valid.
Add R100 to the price of any room with a lake view.
If the input value for view is invalid display a corresponding message and set the price of the room as lake view.
*/

import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;
        String bedType = "";
        boolean isValidBedChoice = false;

        do {
            System.out.print("Choose 1 for 'queen bed', 2 for 'king bed' or 3 for 'king bed and pullout couch': ");
            int bedChoice = scanner.nextInt();

            switch (bedChoice) {
                case 1:
                    bedType = "queen bed";
                    price = 500;
                    isValidBedChoice = true;
                    break;
                case 2:
                    bedType = "king bed";
                    price = 700;
                    isValidBedChoice = true;
                    break;
                case 3:
                    bedType = "king bed and pullout couch";
                    price = 900;
                    isValidBedChoice = true;
                    break;
                default:
                    System.out.println("Invalid bed choice.\nPlease choose either 1, 2, or 3 to proceed.");
                    break;
            }
        } while (!isValidBedChoice);

        System.out.print("Enter 1 for 'Lake view' or 2 for 'Park view': ");
        int viewChoice = scanner.nextInt();
        String viewType;

        switch (viewChoice) {
            case 1:
                viewType = "Lake view";
                price += 100;
                break;
            case 2:
                viewType = "Park view";
                break;
            default:
                System.out.println("Invalid view choice. Defaulting to Lake view.");
                viewType = "Lake view";
                price += 100;
                break;
        }

        System.out.println("You chose a " + bedType + " with a " + viewType + ".");
        System.out.println("The total price is R" + price + ".");

        scanner.close();
    }
}