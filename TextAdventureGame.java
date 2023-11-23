import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious world full of magic and wonders.");

        // Start the game
        startGame(scanner);

        // Close the scanner
        scanner.close();
    }

    private static void startGame(Scanner scanner) {
        // Initial storyline
        System.out.println("\nYou encounter a fork in the road. Do you want to go left or right?");
        String decision1 = getUserInput(scanner);

        // First decision point
        if (decision1.equalsIgnoreCase("left")) {
            System.out.println("\nYou come across a dark forest. Do you want to enter or find another path?");
            String decision2 = getUserInput(scanner);

            if (decision2.equalsIgnoreCase("enter")) {
                // Outcome 1
                System.out.println("\nYou discover a hidden treasure and gain magical powers. You win!");
            } else {
                // Outcome 2
                System.out.println("\nYou find a safer path and continue your journey.");
            }
        } else if (decision1.equalsIgnoreCase("right")) {
            // Outcome 3
            System.out.println("\nYou encounter a friendly village. The villagers offer you assistance. You continue your journey.");
        } else {
            // Invalid input
            handleInvalidInput(scanner);
            startGame(scanner); // Restart the current section
        }
    }

    private static String getUserInput(Scanner scanner) {
        System.out.print("Your choice: ");
        return scanner.nextLine();
    }

    private static void handleInvalidInput(Scanner scanner) {
        System.out.println("Invalid input. Please enter a valid choice.");
        scanner.nextLine(); // Consume the invalid input
    }
}

