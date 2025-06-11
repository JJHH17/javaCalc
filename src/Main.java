import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to this Calculator application!");
        Scanner input = new Scanner(System.in);

        int inputNumber = 0; // Used for user input
        int inputNumber2 = 0;

        String continueInput = ""; // Prompts if user wishes to continue
        int total = 0; // Used for answer

        boolean flag = true;

        // Recurring loop for calculator, until exit criteria is met
        while (flag) {
            System.out.println("Please enter a number: ");
            inputNumber = input.nextInt();
            input.nextLine(); // Consumes new line

            System.out.println("Please enter an operator (+, -, /, *): ");
            String operator = input.nextLine();

            System.out.println("Please enter a second number: ");
            inputNumber2 = input.nextInt();

            // Running main calc checks
            switch (operator) {
                case "+":
                    total = inputNumber + inputNumber2;
                    System.out.println("Total: " + total);
                    break;
                case "-":
                    total = inputNumber - inputNumber2;
                    System.out.println("Total: " + total);
                    break;
                case "/":
                    total = inputNumber / inputNumber2;
                    System.out.println("Total: " + total);
                    break;
                case "*":
                    total = inputNumber * inputNumber2;
                    System.out.println("Total: " + total);
                    break;
                default:
                    System.out.println("Please enter a valid operator");
            }

            System.out.print("Do you wish to continue? ");
            continueInput = input.nextLine();

            if (continueInput.equalsIgnoreCase("exit")) {
                flag = false;
            } else {
                continue;
            }
        }
        input.close();
    }
}