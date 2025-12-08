import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        System.out.println(refuels(new ArrayList<>(Arrays.asList(7, 7, 7)), 7));       // 3
        System.out.println(refuels(new ArrayList<>(Arrays.asList(9, 1, 3)), 3));       // 4
        System.out.println(refuels(new ArrayList<>(Arrays.asList(100, 200, 10)), 10)); // 31
    }

    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {

        int refuelCount = 0;
        int currentFuel = 0;

        for (int each : deliveries) {

            int times = each / gasTank;
            int remainder = each % gasTank;

            refuelCount += times;

            if (remainder > 0) {
                refuelCount++;
            }
        }

        return refuelCount;
    }
}
