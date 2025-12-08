public class Task {

    public static void main(String[] args) {

        int[] nums1 = {2, 4, 2, 3, -2};
        System.out.println(findMax(nums1)); // 4

        int[] nums2 = {1, 33, 5, 7, 9};
        System.out.println(findMax(nums2)); // 33

        int[] nums3 = {-12, -10, -3, -6, -9};
        System.out.println(findMax(nums3)); // -3
    }

    public static int findMax(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
