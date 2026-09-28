import java.util.Scanner;

public class VisitorPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stores the visitor's name
        String visitorName;

        // Stores the visit date
        String visitDate;

        // Stores the host employee's name
        String hostName;

        // Stores the visitor pass number
        int passNumber;

        System.out.print("Enter visitor name: ");
        visitorName = sc.nextLine();

        System.out.print("Enter visit date: ");
        visitDate = sc.nextLine();

        System.out.print("Enter host employee name: ");
        hostName = sc.nextLine();

        System.out.print("Enter pass number: ");
        passNumber = sc.nextInt();

        System.out.println("\n========== VISITOR PASS ==========");
        System.out.printf("Pass Number:\t%d%n", passNumber);
        System.out.printf("Visitor Name:\t%s%n", visitorName);
        System.out.printf("Visit Date:\t%s%n", visitDate);
        System.out.printf("Host Employee:\t%s%n", hostName);
        System.out.println("==================================");

        sc.close();
    }
}