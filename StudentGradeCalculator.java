import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] studentScores = new int[numStudents];
        int sum = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            studentScores[i] = scanner.nextInt();

            // Assuming a simple grading scale from 0 to 100
            if (studentScores[i] < 0 || studentScores[i] > 100) {
                System.out.println("Invalid score! Scores should be between 0 and 100.");
                i--; // Decrement i to re-enter the score for the same student
            } else {
                sum += studentScores[i];
            }
        }

        double average = (double) sum / numStudents;

        System.out.println("\nStudent Scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentScores[i]);
        }

        System.out.println("\nAverage Grade: " + average);

        // You can add additional logic to determine the letter grade based on the
        // average.
        // For example, you can use if-else statements to assign letter grades (A, B, C,
        // etc.).

        scanner.close();
    }
}
