import java.util.Scanner;

/**
 * @author Sinenhlanhla Mchunu
 *
 */

public class GetInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        float salary;
        boolean isMarried=true;
        char initial='K';
       String firstname ="S";


       System.out.print("enter your initial");
       initial=sc.next().charAt(0);
       System.out.print("Enter your name");
       firstname= sc.next();
       System.out.print("Enter your age: ");
       age= sc.nextInt();
       System.out.print("Enter your height: ");
       height= sc.nextDouble();
       System.out.print("Enter your salary: ");
       salary= sc.nextFloat();

       System.out.println("\n=========Details========");
       System.out.println("Name: "+firstname +"("+ initial+")");
       System.out.println("Age: "+age);
       System.out.println("Height: "+height);
       System.out.println("Salary: "+salary);
       System.out.println("Married: "+isMarried);


    }
}
