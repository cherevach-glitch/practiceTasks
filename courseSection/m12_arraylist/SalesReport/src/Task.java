import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        System.out.println(calculateSales(new ArrayList<>(Arrays.asList(
                300000.0, 200000.0, 250000.0, 250000.0
        ))));

        System.out.println(calculateSales(new ArrayList<>(Arrays.asList(
                1200000.0, 1300000.0, 1400000.0, 1500000.0
        ))));


        System.out.println(calculateSales(new ArrayList<>(Arrays.asList(
                3000000.0, 5000.0, 250000.0, 1000000.0, 350000.0
        ))));
    }

    public static boolean calculateSales(ArrayList<Double> sales) {

        double total = 0;

        for (double each : sales) {


            if (each < 30000) {
                return false;
            }

            total += each;
        }

        return total >= 5_000_000;
    }
}
