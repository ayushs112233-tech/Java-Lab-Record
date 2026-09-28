// Task 2: Electricity Bill
import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Constant rate per unit
        final double RATE_PER_UNIT = 7.5;

        int units;
        double billAmount;

        // Read units consumed
        System.out.print("Enter units consumed: ");
        units = input.nextInt();

        // Calculate bill amount
        billAmount = units * RATE_PER_UNIT;

        // Display bill
        System.out.println("Electricity Bill = " + billAmount);
    }
}