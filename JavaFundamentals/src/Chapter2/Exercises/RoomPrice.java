package Chapter2.Exercises;
import javax.swing.JOptionPane;
public class RoomPrice {
    public static void main(String[] args) {
        //Defines the class RoomPrice
        int price = 0;

        // Prompt user for bed type
        String bedType = JOptionPane.showInputDialog(
                "Choose bed type:\n" +
                        "A - Queen bed ($125)\n" +
                        "B - King bed ($139)\n" +
                        "C - King bed + Pullout couch ($165)"
        );
       //If the user presses "Cancel", the program stops.
        if (bedType == null) {
            JOptionPane.showMessageDialog(null, "Cancelled by user.");
            return;
        }

        //Removes spaces and converts the input to uppercase (so it's easier to check).
        bedType = bedType.trim().toUpperCase();

        switch (bedType) {
            case "A":
                price = 125;
                break;
            case "B":
                price = 139;
                break;
            case "C":
                price = 165;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid bed type entered. Price set to $0.");
                return;
        }

        // Prompt for view type only if bed type is valid
        String viewType = JOptionPane.showInputDialog(
                "Choose view type:\n" +
                        "1 - Lake view (+$15)\n" +
                        "2 - Park view"
        );

        if (viewType == null) {
            JOptionPane.showMessageDialog(null, "Cancelled by user.");
            return;
        }

        viewType = viewType.trim();
      //Validate View Type and Add Price
        if (viewType.equals("1")) {
            price += 15;
        } else if (!viewType.equals("2")) {
            JOptionPane.showMessageDialog(null, "Invalid view type entered.");
            return;
        }

        // Display total price
        JOptionPane.showMessageDialog(null, "Total room price: $" + price);
    }
}
