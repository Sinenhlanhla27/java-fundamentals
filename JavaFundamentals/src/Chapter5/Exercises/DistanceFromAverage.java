package Chapter5.Exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_NUMBERS = 10;
        int[] numbers = new int[MAX_NUMBERS];
        int count = 0;
        double sum = 0;

        System.out.println("Enter up to 10 integers (enter 0 to quit):");

        while (count < MAX_NUMBERS) {
            System.out.print("Enter integer #" + (count + 1) + ": ");

            // Check for valid integer input
            if (!input.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter an integer.");
                input.next(); // Clear the invalid input
                continue;
            }

            int num = input.nextInt();

            // Check if user wants to quit early
            if (num == 0) {
                if (count == 0) {
                    System.out.println("❌ Error: No numbers were entered.");
                    return;
                } else {
                    break;
                }
            }

            numbers[count] = num;
            sum += num;
            count++;
        }

        // Calculate average
        double average = sum / count;

        // Output results
        System.out.println("\n--- Results ---");
        System.out.printf("Average: %.2f\n", average);
        for (int i = 0; i < count; i++) {
            double distance = Math.abs(numbers[i] - average);
            System.out.printf("Value: %d | Distance from average: %.2f\n", numbers[i], distance);
        }

        input.close();
    }
}