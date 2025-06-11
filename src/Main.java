import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to this Calculator application!");
        Scanner input = new Scanner(System.in);

        int inputNumber = 0; // Used for user input
        String operator = "";
        int inputNumber2 = 0;

        String continueInput = ""; // Prompts if user wishes to continue
        int total = 0; // Used for answer

        // Recurring loop for calculator, until exit criteria is met
        while (true) {
            System.out.println("Please enter a number: ");
            inputNumber = input.nextInt();

            System.out.println("Please enter an operator (+, -, /, *): ");
            operator = input.nextLine();

            System.out.println("Please enter a second number: ");
            inputNumber2 = input.nextInt();

            // Running main calc checks


            System.out.print("Do you wish to continue? ");
            continueInput = input.nextLine();

            if (continueInput.equals("Exit")) {
                break;
            }
        }
    }
}