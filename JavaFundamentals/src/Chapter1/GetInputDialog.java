package Chapter1;

import javax.swing.*;

public class GetInputDialog {
    public static void main(String[] args) {
        String firstname;

        firstname = JOptionPane.showInputDialog("First name");

        String initials = JOptionPane.showInputDialog("Enter your initials:");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));


        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm):"));


        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary:"));


        String message = "Your Details:\n"
                + "Initials: " + initials + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + " cm\n"
                + "Salary: R" + salary;

        JOptionPane.showMessageDialog(null, message);
    }

    }

