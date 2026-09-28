// Task 11: Travel Cost Estimator
import java.util.Scanner;

public class TravelCostEstimator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        double distance;
        double mileage;
        double petrolPrice;
        double fuelNeeded;
        double cost;

        // Read travel details
        System.out.print("Enter distance (km): ");
        distance = input.nextDouble();

        System.out.print("Enter mileage (km/l): ");
        mileage = input.nextDouble();

        System.out.print("Enter petrol price per litre: ");
        petrolPrice = input.nextDouble();

        // Calculate fuel needed and cost
        fuelNeeded = distance / mileage;
        cost = fuelNeeded * petrolPrice;

        // Display results
        System.out.println("Fuel Needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);
    }
}