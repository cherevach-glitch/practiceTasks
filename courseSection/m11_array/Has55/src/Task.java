public class Task {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 5, 1, 1};
        System.out.println(has55(arr1));

        int[] arr2 = {1, 5, 4, 1, 5};
        System.out.println(has55(arr2));

        int[] arr3 = {1, 4, 4, 1, 99};
        System.out.println(has55(arr3));

        int[] arr4 = {1, 5, 1, 2, 5, 5};
        System.out.println(has55(arr4));
    }

    public static boolean has55(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                return true;
            }
        }

        return false;
    }
}
