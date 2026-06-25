// Task 4: Salary Calculator
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Constants for DA and HRA rates
        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        double basicSalary;
        double da;
        double hra;
        double grossSalary;

        // Read basic salary
        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        // Calculate DA and HRA
        da = basicSalary * DA_RATE;
        hra = basicSalary * HRA_RATE;

        // Calculate gross salary
        grossSalary = basicSalary + da + hra;

        // Display salary details
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}