package Chapter4.Exercise;

import javax.swing.JOptionPane;
import java.time.Year;

public class StudentGrade {

    // Method to display a greeting
    public static void greetings() {
        JOptionPane.showMessageDialog(null, "Hi,Welcome to the Student Grade Program!");
    }

    // Method to determine the grade based on the test mark
    public static String determineGrade(double testMark) {
        if (testMark > 90) {
            return "A+";
        } else if (testMark >= 80) {
            return "A";
        } else if (testMark >= 70) {
            return "B";
        } else if (testMark >= 60) {
            return "C";
        } else if (testMark >= 50) {
            return "D";
        } else if (testMark >= 40) {
            return "D-";
        } else {
            return "F";
        }
    }

    // Method to determine the age from birth year
    public static int determineAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    // Method to display final output
    public static void displayOutput(String firstName, String lastName, int age, String grade) {
        String message = "Student Details:\n"
                + "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Age: " + age + "\n"
                + "Grade: " + grade;

        JOptionPane.showMessageDialog(null, message);
    }

    // Main method
    public static void main(String[] args) {
        greetings();

        // Get user input
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String lastName = JOptionPane.showInputDialog("Enter your last name:");
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth year:"));
        double testMark = Double.parseDouble(JOptionPane.showInputDialog("Enter your test mark:"));

        // Process
        int age = determineAge(birthYear);
        String grade = determineGrade(testMark);

        // Display output
        displayOutput(firstName, lastName, age, grade);
    }
}
