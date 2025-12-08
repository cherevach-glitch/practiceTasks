import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 5, 8, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0, 0, 3, 5, 8));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 5, 4));

        System.out.println(isSorted(list1));
        System.out.println(isSorted(list2));
        System.out.println(isSorted(list3));
    }

    public static boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
