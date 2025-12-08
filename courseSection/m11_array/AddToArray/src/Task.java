import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[] arr1 = {2, 1, 2, 3, 4};
        System.out.println(Arrays.toString(addToArray(arr1, 10)));

        int[] arr2 = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(addToArray(arr2, 21)));
    }

    public static int[] addToArray(int[] numbers, int extraNumber) {

        int[] newArray = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }

        newArray[newArray.length - 1] = extraNumber;

        return newArray;
    }
}
