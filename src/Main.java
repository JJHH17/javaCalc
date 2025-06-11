import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to this Calculator application!");
        Scanner input = new Scanner(System.in);

        int total;

        boolean flag = true;

        // Recurring loop for calculator, until exit criteria is met
        while (flag) {
            System.out.println("Please enter a number: ");
            int inputNumber = input.nextInt();
            input.nextLine(); // Consumes new line

            System.out.println("Please enter an operator (+, -, /, *): ");
            String operator = input.nextLine();

            System.out.println("Please enter a second number: ");
            int inputNumber2 = input.nextInt();

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
            input.nextLine();
            String continueInput = input.nextLine();


            if (continueInput.equalsIgnoreCase("exit")) {
                flag = false;
            }
        }
        input.close();
    }
}