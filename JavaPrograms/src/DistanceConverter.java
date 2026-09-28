// Task 3: Distance Converter
import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        double kilometers;
        double meters;
        double centimeters;

        // Read distance in kilometers
        System.out.print("Enter distance in km: ");
        kilometers = input.nextDouble();

        // Convert distance
        meters = kilometers * 1000;
        centimeters = meters * 100;

        // Display converted values
        System.out.println("Meters = " + meters);
        System.out.println("Centimeters = " + centimeters);
    }
}