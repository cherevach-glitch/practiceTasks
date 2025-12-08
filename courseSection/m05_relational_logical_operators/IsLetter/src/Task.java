public class Task {
    public static void main(String[] args) {

        char c = 'a';

        boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');

        System.out.println("isLetter = " + isLetter);
    }
}
