
public class Task {

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindrome(int num) {

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}
