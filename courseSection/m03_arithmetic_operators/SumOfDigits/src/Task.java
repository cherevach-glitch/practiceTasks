public class Task {
    public static void main(String[] args) {

        int number = 256;
        int digit1, digit2, digit3;
        int sum;

        digit1 = number / 100;
        digit2 = (number / 10) % 10;
        digit3 = number % 10;

        sum = digit1 + digit2 + digit3;

        System.out.println("Input: number = " + number);
        System.out.println("Output: Sum of the digits: " + sum);
    }
}
