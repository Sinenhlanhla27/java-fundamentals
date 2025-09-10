package Chapter3.Exercises;
import javax.swing.JOptionPane;
/**
 * @author Sinenhlanhla Mchunu
 */

 public class RetirementGoal {
        public static void main(String[] args) {
           //Declare variables
            //both these are initialized with 0 or 0.0 - so I can enter a validation loop
            int yearsUntilRetirement = 0; // this stores how many years the user has left until retirement.
            double annualSavings = 0.0; // this stores how much money the user can save per year

            // Asks the user how many years until they retire.
            while (yearsUntilRetirement <= 0) {
                String input = JOptionPane.showInputDialog(null,
                        "Enter the number of years until retirement:",
                        "Retirement Calculator",
                        JOptionPane.QUESTION_MESSAGE);

                if (input == null) {
                    // if the user clicks cancel, the method returns and exits the program.
                    return;
                }

                try {
                    yearsUntilRetirement = Integer.parseInt(input); //Tries to convert the input string into an integer.
                    //If successful, it assigns it to yearsUntilRetirement.
                    if (yearsUntilRetirement <= 0) {  //If the user enters 0 or a negative number, it shows an error.
                        JOptionPane.showMessageDialog(null,
                                "Please enter a number greater than 0.",
                                "Invalid Input",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) { //If the user types something that’s not a number, it shows an error.
                    JOptionPane.showMessageDialog(null,
                            "Invalid input. Please enter a whole number.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            // Ask user for annual savings
            while (annualSavings <= 0) {
                String input = JOptionPane.showInputDialog(null,
                        "Enter the amount of money you can save annually:",
                        "Retirement Calculator",
                        JOptionPane.QUESTION_MESSAGE);

                if (input == null) {
                    // User clicked cancel
                    return;
                }

                try {
                    annualSavings = Double.parseDouble(input); //Converts the input to a double.
                    if (annualSavings <= 0) {
                        JOptionPane.showMessageDialog(null,
                                "Please enter a number greater than 0.",
                                "Invalid Input",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input. Please enter a numeric value.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            // Calculate total retirement savings
            double totalSavings = yearsUntilRetirement * annualSavings;

            // This shows the result
            JOptionPane.showMessageDialog(null,
                    String.format("You will have R%.2f at retirement.", totalSavings),
                    "Retirement Total",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

