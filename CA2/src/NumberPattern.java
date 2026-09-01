import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        // Number pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sum += number;
            count++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("Average: 0");
        }

        sc.close();
    }
}