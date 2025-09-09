package Chapter2.SelectionStructures;

public class IfStatements {
    public static void main(String[] args) {

            int a = 5, b = 7, c = 9, d = 10;
            boolean x = true, y = false;
            //single if
            if (a > 5)
                System.out.println("Statement A");
            System.out.println("Statement B");
            //binary if
            if (a <= b)
            {
                System.out.println("Statement A");
            }
            else
            {
                System.out.println("Statement B");
            }

            //if-else-if
            if (a != b)
            {
                System.out.println("Statement A");
            }
            else if (a == b)
            {
                System.out.println("Statement B");
            }
            else if (a >= b)
            {
                System.out.println("Statement C");
            }
            else
            {
                System.out.println("Statement D");
            }
            //nested if
            if (x == true)
            {
                if (a == 5)
                {
                    System.out.println("Statement X");
                }
                else
                {
                    System.out.println("Statement Y");
                }
            }
            else
            {
                System.out.println("Statement X");
            }
        }

    }
