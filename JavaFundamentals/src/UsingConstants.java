/**
 * @author Sinenhlanhla Mchunu
 * Using constant values: Shouldn't change during program
 * execution
 * Use 'final' keyword to show that this is constant is does not change
 */



public class UsingConstants {
    public static void main(String[] args) {
        final int CURRENT_YEAR= 2025;
        final String COMPANY_NAME = "iLAB";
        String welcomeMessage;

        welcomeMessage = "Welcome to " + COMPANY_NAME + "S" + CURRENT_YEAR+ "internship program";

        System.out.println(welcomeMessage);
    }
}
