package Chapter2.Operators;

/**
 * @author Sinenhlanhla Mchunu
 * This class demonstrate the use of pre increment/decrement
 * and post increment/decrement
 * variable++ this means you increment and keep original value
 * ++variable means you increment overwrite the original value
 */

public class IncrementDecrement {
    public static void main(String[] args) {

        int number = 25;

        System.out.println("===========POST==========\n");
        //post increment/decrement
        System.out.println("Original value of number: " + number);//25
        System.out.println("Increment the value of the number by 1, but only updates after being used " + number++);
        System.out.println("New value of number is: " + number);//26
        System.out.println("Decrement the value of the number by 1, but only updates after being used " + number--);
        System.out.println("New value of number is: " + number);//25

         number=25;
        System.out.println("===========PRE==========\n");
        //pre increment/decrement
        System.out.println("Original value of number: " + number);//25
        System.out.println("Increment the value of the number by 1, and update the value before being accessed: " + ++number);
        System.out.println("New value of number is: " + number);//26
        System.out.println("Decrement the value of the number by 1, and update the value before being accessed: " + --number);
        System.out.println("New value of number is: " + number);//25
    }
}
