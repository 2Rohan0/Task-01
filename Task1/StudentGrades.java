import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the grades of students. Type -1 to stop:");

        // Input grades from the user
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break; // Stop input when -1 is entered
            }

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Calculate average, highest, and lowest scores
            int total = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = (double) total / grades.size();

            // Display results
            System.out.println("\nGrade Analysis:");
            System.out.printf("Average Grade: %.2f\n", average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close();
    }
}