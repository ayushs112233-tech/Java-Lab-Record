// Task 1: Student Mark Calculator
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Variables to store marks, total and average
        int mark1, mark2, mark3;
        int total;
        double average;

        // Read marks from user
        System.out.print("Enter mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = input.nextInt();

        // Calculate total and average
        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        // Display results
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        // Check if average is above or below 50
        if (average >= 50)
            System.out.println("Above 50 average");
        else
            System.out.println("Below 50 average");
    }
}