package Chapter3;

/**
 * @author Sinenhlanhla Mchunu
 * use the for loop when you know the number of times
 * the loop should execute
 */

public class ForLoop {
    public static void main(String[] args) {

        //Display Java 5 times
        for(int x=1; x<=5;x++){
            System.out.print(x + "- Java");
        }
        //multiple conditions
        for(int x=1, y=5; x <10; x++,y--){
            System.out.println(x + "<------>" + y);
        }
    }
}
