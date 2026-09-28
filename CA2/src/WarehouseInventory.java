import java.util.Scanner;

public class WarehouseInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stock = {15, 7, 20, 5, 12, 8, 25, 3};

        int totalStock = 0;

        for (int i = 0; i < stock.length; i++) {

            if (stock[i] < 10) {
                System.out.println("Product " + i + ": REORDER");
            } else {
                System.out.println("Product " + i + ": OK");
            }

            totalStock += stock[i];
        }

        System.out.println("Total Stock: " + totalStock);

        System.out.print("Enter product index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Stock Level: " + stock[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index.");
        }

        sc.close();
    }
}