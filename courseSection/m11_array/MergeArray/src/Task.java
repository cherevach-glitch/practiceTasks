import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5};
        System.out.println(Arrays.toString(mergeArray(a1, b1)));


        int[] a2 = {5, 25, 1};
        int[] b2 = {0, 3, 6};
        System.out.println(Arrays.toString(mergeArray(a2, b2)));

        int[] a3 = {8};
        int[] b3 = {4, 10, 9, 2};
        System.out.println(Arrays.toString(mergeArray(a3, b3)));

    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {

            if (i < arr1.length) {
                result[index++] = arr1[i];
            }

            if (i < arr2.length) {
                result[index++] = arr2[i];
            }
        }

        return result;
    }
}
