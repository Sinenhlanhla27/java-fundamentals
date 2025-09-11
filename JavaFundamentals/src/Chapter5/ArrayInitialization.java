package Chapter5;

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] arNumbers = new int[]{52,41,32,74};
        String[] arNames = new String[]{"Kate", "John", "Carol", "David", "Mike"};
        double[] arPrice = new double[]{23.55, 15.5, 52.99, 99.99, 75.69};
        double[] arSales = {5000.00, 20000.00, 5000.00, 5500.00, 6750.00};

        //arPrice = new double[]{500, 600};
        arSales = new double[]{5000, 6000};

        //Access array elements
        System.out.println("===========Numbers=============");
        for (int i = 0; i <= arNumbers.length - 1; i++) {
            System.out.print(arNumbers[i] + "  ");
        }

        System.out.println("\n===========Names=============");
        int count = 0;
        while (count < arNames.length){
            System.out.println(arNames[count]);
            count++;
        }

        System.out.println("\n===========Prices=============");
        for (int i = 0; i < arPrice.length; i++) {
            double price = arPrice[i];
            System.out.println(price);
        }

        System.out.println("old price\tNew price");
        for (double price : arPrice){
            price = price + (price * 0.1);//change each price
            System.out.println(price);
        }

    }
}
