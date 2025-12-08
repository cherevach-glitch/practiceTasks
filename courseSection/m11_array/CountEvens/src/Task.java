
public class Task {

    public static void main(String[] args) {

        int[] nums1 = {2, 1, 2, 3, 4};
        System.out.println(countEvens(nums1)); // 3

        int[] nums2 = {1, 3, 5, 7, 9};
        System.out.println(countEvens(nums2)); // 0
    }

    public static int countEvens(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
