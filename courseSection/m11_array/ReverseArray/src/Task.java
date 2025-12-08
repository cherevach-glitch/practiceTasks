import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[] a1 = {5, 1, 32, 100, 31, 13};
        System.out.println(Arrays.toString(reverseArray(a1)));


        int[] a2 = {7, 325, 4, 94, 15};
        System.out.println(Arrays.toString(reverseArray(a2)));

    }

    public static int[] reverseArray(int[] nums) {

        int[] reversed = new int[nums.length];
        int index = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            reversed[index++] = nums[i];
        }

        return reversed;
    }
}
