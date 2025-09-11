package Chapter5.Exercises;

import java.util.Scanner;

public class ArrayMethodDemo {
    // 1. Display all integers
    public static void displayAll(int[] array) {
        System.out.println("All values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 2. Display in reverse order
    public static void displayReverse(int[] array) {
        System.out.println("Values in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 3. Display sum of integers
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Sum of all values: " + sum);
        return sum;
    }

    // 4. Display values less than a limit
    public static void displayLessThanLimit(int[] array, int limit) {
        System.out.println("Values less than " + limit + ":");
        boolean found = false;
        for (int value : array) {
            if (value < limit) {
                System.out.print(value + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // 5. Display values greater than average
    public static void displayGreaterThanAverage(int[] array) {
        int sum = calculateSum(array); // reuse method
        double average = (double) sum / array.length;
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Values greater than average:");
        boolean found = false;
        for (int value : array) {
            if (value > average) {
                System.out.print(value + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[8];

        System.out.println("Enter 8 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            while (!input.hasNextInt()) {
                System.out.println("❌ Invalid input. Please enter an integer.");
                input.next(); // discard invalid input
                System.out.print("Enter number #" + (i + 1) + ": ");
            }
            numbers[i] = input.nextInt();
        }

        // Call methods
        displayAll(numbers);
        displayReverse(numbers);
        calculateSum(numbers);

        // Ask user for limit and display values less than that
        System.out.print("Enter a limit to find values less than it: ");
        while (!input.hasNextInt()) {
            System.out.println("❌ Invalid input. Please enter an integer.");
            input.next(); // discard invalid input
            System.out.print("Enter a limit to find values less than it: ");
        }
        int limit = input.nextInt();
        displayLessThanLimit(numbers, limit);

        displayGreaterThanAverage(numbers);

        input.close();
    }
}
