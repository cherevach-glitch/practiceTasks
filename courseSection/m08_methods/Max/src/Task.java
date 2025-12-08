public class Task {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println(max(1, 10));
        System.out.println(max(20, 19));
        System.out.println(max(11, 5));
    }
}
