import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to this Calculator application!");
        Scanner input = new Scanner(System.in);

        boolean flag = true;

        // Recurring loop for calculator, until exit criteria is met
        while (flag) {
            int num1 = 0;
            int num2 = 0;


            try {
                System.out.println("Please enter a number: ");
                num1 = input.nextInt(); // Consumes new line
                input.nextLine(); // Consumes new line
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }

            System.out.println("Please enter an operator (+, -, /, *): ");
            String operator = input.nextLine();


            try {
                System.out.println("Please enter a second number: ");
                num2 = input.nextInt(); // Consumes new line
            } catch (Exception y) {
                System.out.println("Please enter a valid number");
            }


            // Running main calc checks
            switch (operator) {
                case "+":
                    System.out.println("Total: " + sum(num1, num2));
                    break;
                case "-":
                    System.out.println("Total: " + sub(num1, num2));
                    break;
                case "/":
                    div(num1, num2);
                    break;
                case "*":
                    System.out.println("Total: " + multi(num1, num2));
                    break;
                default:
                    System.out.println("Please enter a valid operator");

            }

            System.out.print("Do you wish to continue? ");
            input.nextLine();
            String continueInput = input.nextLine();

            if (continueInput.equalsIgnoreCase("no")) {
                flag = false;
            }
        }
        input.close();
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    public static int sub(int num1, int num2) {
        return num1 - num2;
    }


    public static void div(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        }
    }


    public static int multi(int num1, int num2) {
        return num1 * num2;
    }
}