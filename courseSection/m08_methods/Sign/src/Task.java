public class Task {

    public static void sign(int n) {

        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {

        sign(5);
        sign(-30);
        sign(0);
    }
}
