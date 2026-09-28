// Task 7: Temperature Converter
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit;

        // Read temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("Fahrenheit = " + fahrenheit);
    }
}