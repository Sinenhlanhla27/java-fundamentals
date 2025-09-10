package Chapter4;

import java.util.Scanner;

public class ReturnTypeMethods {
    public static void main(String[] args) {

    }

    public static String getAddress(){
        return "123 Main Street";
    }

    public static int getSum(){
        int num1 =5;
        int num2 =15;
        return num1+num2;
    }

    public static Scanner getPen(){
        return new Scanner(System.in);
    }

    public static boolean isEven(){
        int num =12;

        if(num%2==0){
            return true;
        }
        return false;
    }
}
