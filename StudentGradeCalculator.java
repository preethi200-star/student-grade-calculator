import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];
        int total = 0;

        // Step 2: Input marks for each subject
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validate input (0 - 100)
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // re-enter this subject
            } else {
                total += marks[i];
            }
        }

        // Step 3: Calculate average
        double average = (double) total / subjects;

        // Step 4: Calculate grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 5: Display results
        System.out.println("\n----- Student Report -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
