// Task 10: Grocery Shop Bill
import java.util.Scanner;

public class GroceryShopBill {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Discount rate constant
        final double DISCOUNT = 0.10;

        double item1, item2, item3;
        double total, discountAmount, finalAmount;

        // Read item prices
        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        // Calculate total and discount
        total = item1 + item2 + item3;
        discountAmount = total * DISCOUNT;
        finalAmount = total - discountAmount;

        // Display bill details
        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}