package Chapter3;

/**
 * @author Sinenhlanhla Mchunu
 *
 */
public class TerminationTechniques {
    public static void main(String[] args) {

        // break :exit/end the loop
        for(int i=0;i<20;i++){
            if (i==5) break;
            System.out.println("i=" +i+", ");
        }

        //Continue: skip current iteration
        System.out.println("\n\n=====Continue======");
        for(int i=0;i<20;i++){
            if (i%5==0) continue;
            System.out.println("i=" +i);
        }

        for(int i = 0;i<20;i++){
            if (i==5) break;
            if (i==3) continue;
            System.out.println("i=" +i);
        }
    }
}
