import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","2","3","5")), 0, 5)); // true
        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","nanuk","3","5")), 0, 5)); // false
        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","3")), 0, 5)); // false
        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk")), 2, 7)); // true
        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk")), 2, 7)); // true
        System.out.println(hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk","nanuk")), 2, 7)); // false
    }

    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int totalCatch = 0;

        for (String each : result) {

            if (each.equals("nanuk")) {
                if (wayStones > 0) {
                    wayStones--;
                } else {
                    return false;
                }
            } else {
                totalCatch += Integer.parseInt(each);
            }
        }

        return totalCatch >= boast;
    }
}
