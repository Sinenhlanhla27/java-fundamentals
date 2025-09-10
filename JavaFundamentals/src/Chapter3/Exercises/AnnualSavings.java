package Chapter3.Exercises;
import javax.swing.JOptionPane;

/**
 * @author Sinenhlanhla Mchunu
 */
public class AnnualSavings {
    public static void main(String[] args) {
        //Declare variables
        int yearsUntilRetirement = 0;
        double initialAnnualSavings = 0;

        // Prompt for years until retirement
        while (yearsUntilRetirement <= 0) {
            String input = JOptionPane.showInputDialog(null,
                    "Enter the number of years until retirement (must be greater than 0):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Cancelled by user. Exiting.");
                System.exit(0);
            }
       //handles cases where the input is not a number and shows an error message.
            try {
                yearsUntilRetirement = Integer.parseInt(input);
                if (yearsUntilRetirement <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a whole number.");
            }
        }

        // Prompt for the initial annual savings amount
        while (initialAnnualSavings <= 0) {
            String input = JOptionPane.showInputDialog(null,
                    "Enter the initial annual savings amount (must be greater than 0):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Cancelled by user. Exiting.");
                System.exit(0);
            }

            try {
                initialAnnualSavings = Double.parseDouble(input);
                if (initialAnnualSavings <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }

        // Calculate total savings with 10% increase each year
        double totalSavings = 0;
        double annualSavings = initialAnnualSavings;
        StringBuilder breakdown = new StringBuilder("Savings Breakdown:\n");

        for (int year = 1; year <= yearsUntilRetirement; year++) {
            breakdown.append(String.format("Year %d: R%.2f\n", year, annualSavings));
            totalSavings += annualSavings;

            // Increase by 10% for next year
            annualSavings *= 1.10;
        }
         // Shows results
        breakdown.append(String.format("\nTotal savings at retirement: R%.2f", totalSavings));
        JOptionPane.showMessageDialog(null, breakdown.toString());
    }
}
