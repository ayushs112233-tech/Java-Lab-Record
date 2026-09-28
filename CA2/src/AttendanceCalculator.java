import java.util.Scanner;

public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        if (totalClasses <= 0) {
            System.out.println("Total classes must be greater than zero.");
        } else {
            double percentage = (double) attendedClasses / totalClasses * 100;

            System.out.printf("Attendance Percentage: %.2f%%%n", percentage);
        }

        sc.close();
    }
}