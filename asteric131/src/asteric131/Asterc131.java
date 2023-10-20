package asteric131;

import java.util.Scanner;

public class Asterc131 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        int userInput = -1;

        while (userInput != 0) {
            System.out.println("\n*131# Menu");
            System.out.println("1. My Airtel");
            System.out.println("2. Data & Bundles");
            System.out.println("3. Voice & SMS");
            System.out.println("4. International");
            System.out.println("5. Services");
            System.out.println("6. Airtel Money");
            System.out.println("7. Device Support");
            System.out.println("8. Offers");
            System.out.println("9. Help & Support");
            System.out.println("0. Load new window");

            System.out.print("\nChoose an option: ");
            userInput = getUserInput();

            switch (userInput) {
                case 0:
                    loadNewWindow();
                    break;
                default:
                    System.out.println("\nYou have selected option " + userInput + ".");
                    break;
            }
        }
    }

    private static void loadNewWindow() {
        int userInput = -1;

        while (userInput != 0) {
            System.out.println("\n*131# New Window");
            System.out.println("1. My Airtel");
            System.out.println("2. Data & Bundles");
            System.out.println("3. Voice & SMS");
            System.out.println("4. International");
            System.out.println("5. Services");
            System.out.println("6. Airtel Money");
            System.out.println("7. Device Support");
            System.out.println("8. Offers");
            System.out.println("9. Help & Support");
            System.out.println("0. Go back");

            System.out.print("\nChoose an option: ");
            userInput = getUserInput();

            switch (userInput) {
                case 0:
                    // Go back to the main menu
                    break;
                default:
                    System.out.println("\nYou have selected option " + userInput + ".");
                    break;
            }
        }
    }

    private static int getUserInput() {
        int userInput = 0;
        try {
            userInput = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            scanner.next(); // clear the invalid input
        }
        return userInput;
    }
}
