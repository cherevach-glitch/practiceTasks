public class Task {

    public static void main(String[] args) {

        int hour = 7;

        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon");
        } else if ((hour >= 18 && hour <= 23) || (hour >= 0 && hour < 5)) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid hour");
        }
    }
}
