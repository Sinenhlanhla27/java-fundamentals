package Chapter3;

/**
 * @author Sinenhlanhla Mchunu
 * Do while will execute atleast once
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        char option='a';

        do{
            System.out.println("option="+option);
            option++;
        }while(option!='g');
    }
}
