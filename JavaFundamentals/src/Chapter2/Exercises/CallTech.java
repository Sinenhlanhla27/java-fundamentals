package Chapter2.Exercises;
import javax.swing.JOptionPane;

/**
 * @author Sinenhlanhla Mchunu
 */
public class CallTech {
    public static void main(String[] args) {

        // Get the user inputs
        String minutesInput = JOptionPane.showInputDialog("Enter talk minutes:");
        int minutes = Integer.parseInt(minutesInput);

        String textsInput = JOptionPane.showInputDialog("Enter number of text messages:");
        int texts = Integer.parseInt(textsInput);

        String dataInput = JOptionPane.showInputDialog("Enter data usage in GB (enter 0 if none):");
        double data = Double.parseDouble(dataInput);

        //I initialize variables to store the plan and cost
        String plan = "";
        double cost = 0.0; //These will store the selected plan and its monthly cost, which i calculate based on user input.

        // Determine the best plan based on the user's inputs.
        if (data > 0) {
            if (data < 3) {
                plan = "Plan E";
                cost = 79;
            } else {
                plan = "Plan F";
                cost = 87; //If the user needs any amount of data
            }
        } else if (minutes < 300) {
            if (texts == 0) {
                plan = "Plan A";
                cost = 49;
            } else {
                plan = "Plan B";
                cost = 55; // If there is no data, but less than 300 talk minutes
            }
        } else {
            if (texts < 50) {
                plan = "Plan C";
                cost = 61;
            } else {
                plan = "Plan D";
                cost = 70;  // If the user wants 300 or more minutes, no data
            }
        }

        // Show the result
        String message = "Recommended plan: " + plan + "\nMonthly cost: $" + cost;
        JOptionPane.showMessageDialog(null, message);
    }
}
