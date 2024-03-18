import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask the user to choose an operation (+, -, *, /)
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result; // Variable to store the result of the operation

        // Perform the selected operation
        switch (operation) {
            case '+': // Addition
                result = num1 + num2;
                break;
            case '-': // Subtraction
                result = num1 - num2;
                break;
            case '*': // Multiplication
                result = num1 * num2;
                break;
            case '/': // Division
                // Check if the second number is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    // If the second number is zero, display an error message and exit the program
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            default: // If an invalid operation is entered
                System.out.println("Error: Invalid operation!");
                return; // Exit the program
        }

        // Print the result
        System.out.println("Result: " + result);

        // Close the Scanner object to release resources
        scanner.close();
    }
}
