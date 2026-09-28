// Task 5: Restaurant Bill Generator
import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Constants for GST and service charge
        final double GST_RATE = 0.05;
        final double SERVICE_RATE = 0.10;

        double foodCost;
        double gst;
        double serviceCharge;
        double total;

        // Read food cost
        System.out.print("Enter food cost: ");
        foodCost = input.nextDouble();

        // Calculate GST and service charge
        gst = foodCost * GST_RATE;
        serviceCharge = foodCost * SERVICE_RATE;

        // Calculate final bill
        total = foodCost + gst + serviceCharge;

        // Display bill details
        System.out.println("GST = " + gst);
        System.out.println("Service Charge = " + serviceCharge);
        System.out.println("Final Bill = " + total);
    }
}