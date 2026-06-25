import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentYear, currentMonth;
        int birthYear, birthMonth;

        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter current month (1-12): ");
        currentMonth = input.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        birthMonth = input.nextInt();

        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;

        // Adjust if current month is before birth month
        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        System.out.println("Age = " + ageYears + " years and " + ageMonths + " months");
    }
}