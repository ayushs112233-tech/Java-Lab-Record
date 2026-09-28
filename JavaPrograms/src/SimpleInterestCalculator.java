// Task 8: Simple Interest Calculator
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Default interest rate
        final double DEFAULT_RATE = 5.0;

        double principal, time, interest;

        // Read principal amount and time
        System.out.print("Enter principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter time (years): ");
        time = input.nextDouble();

        // Calculate simple interest
        interest = (principal * DEFAULT_RATE * time) / 100;

        // Display interest
        System.out.println("Interest = " + interest);
    }
}