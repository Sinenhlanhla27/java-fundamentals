package Chapter4;

/**
 * @author Sinenhlanhla Mchunu
 */
public class VoidMethods {
    public static void main(String[] args) {
        displayMessage();
        System.out.println("======================");
        displayAdress();

    }
    public static void displayMessage(){
        System.out.println("Hi, Welcome to Java Training");
    }
    private static void displayAdress(){
        System.out.println("""
                234 Rivonia street.
                sandton
                1234""");
    }

}
