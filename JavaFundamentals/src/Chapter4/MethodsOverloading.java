package Chapter4;

/**
 * @author Sinenhlanhla Mchunu
 */
public class MethodsOverloading {
    public static void main(String[] args) {
        System.out.println("Sum " + calcSum(15F, 32.6F));
        System.out.println(("Sum: " + calcSum(5, 5.66)));

    }

    public static int calcSum(int x, int y, int z) {
        return x + y + z;
    }

    public static double calcSum(double x, int y) {
        return x + y;
    }

    public static double calcSum(int x, double y) {
        return x + y;
    }

    public static int calcSum(int x, int y) {
        return x + y;
    }

    public static double calcSum(double x, double y) {
        return x + y;
    }

    public static float calcSum(float x, float y) {
        return x + y;
    }
}
