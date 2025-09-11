package Chapter6;

public class MyCalculator {
    static int num1, num2;
    public static void main(String[] args) {
        num1 = 22;
        num2 = 5;

        System.out.println("Sum: " + getSum());
        System.out.println("Product: " + getProduct());
        System.out.println("Difference: " + getDiff());
        System.out.println("Quotient: " + getQuotient());

        displayResults();
        System.out.println("Thank You....");
    }

    static int getSum(){
        return num1 + num2;
    }

    static int getDiff(){
        return num1 - num2;
    }
    static int getProduct(){
        num1 = 65;
        return num1 * num2;
    }

    static double getQuotient(){
        System.out.println("Statement 1");
        System.out.println("Current value of Num 1: " + num1);
        System.out.println("Statement 3");
        return num1 / num2;
    }

    static void displayResults(){
        System.out.format("""
                =====OUTPUT======
                Sum: %d
                Product: %d
                Difference: %d
                Quotient: %.2f""", getSum(), getProduct(), getDiff(), getQuotient());
    }
}