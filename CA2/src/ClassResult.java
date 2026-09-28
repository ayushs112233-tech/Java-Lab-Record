public class ClassResult {
    public static void main(String[] args) {

        int[] marks = {78, 85, 92, 67, 88, 74};

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }

            sum += mark;
        }

        double average = (double) sum / marks.length;

        int aboveAverage = 0;

        for (int mark : marks) {
            if (mark > average) {
                aboveAverage++;
            }
        }

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.printf("Average Mark: %.2f%n", average);
        System.out.println("Students Above Average: " + aboveAverage);

        // Deliberate error:
        // System.out.println(marks[marks.length]);
        // This causes ArrayIndexOutOfBoundsException.
    }
}