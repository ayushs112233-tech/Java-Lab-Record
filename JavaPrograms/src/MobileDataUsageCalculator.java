// Task 9: Mobile Data Usage Calculator
import java.util.Scanner;

public class MobileDataUsageCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Data limit constant
        final double DATA_LIMIT = 30.0;

        double usedData, remainingData;

        // Read used data
        System.out.print("Enter data used (GB): ");
        usedData = input.nextDouble();

        // Calculate remaining data
        remainingData = DATA_LIMIT - usedData;

        // Display usage details
        System.out.println("Used = " + usedData + " GB");
        System.out.println("Remaining = " + remainingData + " GB");
    }
}