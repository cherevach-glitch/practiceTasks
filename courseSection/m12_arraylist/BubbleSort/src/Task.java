import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static ArrayList<Integer> sort(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 0; j < nums.size() - 1 - i; j++) {

                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }

            }
        }
        return nums;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 1, 2, 4, 3));
        System.out.println(sort(list1));   // [1, 2, 2, 3, 4]

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 25, 6, 2, -5, 37, -3));
        System.out.println(sort(list2));   // [-5, -3, 2, 5, 6, 25, 37]
    }
}
