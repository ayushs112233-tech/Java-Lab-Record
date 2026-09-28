import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter day code (W = Weekday, H = Holiday): ");
        char day = sc.next().toUpperCase().charAt(0);

        int price;
        String category;

        if (age < 12) {
            price = 100;
            category = "Child";
        } else if (age >= 60) {
            price = 120;
            category = "Senior Citizen";
        } else {
            category = "Regular";

            if (day == 'W') {
                price = 150;
            } else {
                price = 200;
            }
        }

        System.out.println("Category: " + category);
        System.out.println("Ticket Price: Rs. " + price);

        sc.close();
    }
}