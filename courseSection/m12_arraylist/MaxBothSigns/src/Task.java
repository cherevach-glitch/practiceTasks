import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(20, 2, 5, -2, 8, -5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-2, -23, -9, 2, 7, 20));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-2, -23, -9, 3, 7, 20));

        System.out.println(findMaxBoth(list1)); // 5
        System.out.println(findMaxBoth(list2)); // 2
        System.out.println(findMaxBoth(list3)); // 0
    }

    public static int findMaxBoth(ArrayList<Integer> nums) {

        int max = 0;

        for (int each : nums) {
            if (each > 0 && nums.contains(-each)) {
                if (each > max) {
                    max = each;
                }
            }
        }

        return max;
    }
}
