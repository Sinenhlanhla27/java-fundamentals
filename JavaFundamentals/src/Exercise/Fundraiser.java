package Exercise;
import java.util.Scanner;

/**
 * @author Sinenhlanhla Mchunu
 */


public class Fundraiser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prices
        final double ADULT_PRICE = 50.00;
        final double CHILD_PRICE = 37.50;

        // Input: number of adult meals
        System.out.print("Enter the number of adult meals: ");
        int adultMeals = input.nextInt();

        // Input: number of child meals
        System.out.print("Enter the number of child meals: ");
        int childMeals = input.nextInt();

        // Calculations
        double adultTotal = adultMeals * ADULT_PRICE;
        double childTotal = childMeals * CHILD_PRICE;
        double overallTotal = adultTotal + childTotal;

        // Display results
        System.out.println("\nFundraiser Totals:");
        System.out.println("Adult meals (" + adultMeals + "): R" + adultTotal);
        System.out.println("Child meals (" + childMeals + "): R" + childTotal);
        System.out.println("-----------------------------------");
        System.out.println("Overall Total: R" + overallTotal);

        input.close();
    }
}


