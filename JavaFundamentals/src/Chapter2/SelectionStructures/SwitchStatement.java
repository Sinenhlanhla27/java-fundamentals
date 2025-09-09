package Chapter2.SelectionStructures;

/**
 * @author Sinenhlanhla Mchunu
 * this class shows the use of switch statement.
 * switch statement can be used to eva
 */
public class SwitchStatement {
    public static void main(String[] args) {

        int dayOfWeek = 3;

//        if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3) {
//            System.out.println("Weekdays");
//        }else if (dayOfWeek == 4) {
//            System.out.println("Thursday");
//        }else if (dayOfWeek == 5) {
//            System.out.println("Friday");
//        }else if (dayOfWeek == 6) {
//            System.out.println("Saturday");
//        }else {
//            System.out.println("Sunday");
//        }

        // Switch
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
                System.out.println("Weekdays");
            break;
            case 4:  System.out.println("Thursday");
            break;
            case 5:  System.out.println("Friday");
            break;
            case 6:  System.out.println("Saturday");
            break;
            default: System.out.println("Sunday");

        }
    }
}
