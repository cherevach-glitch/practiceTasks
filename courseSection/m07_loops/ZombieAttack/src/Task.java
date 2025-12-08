public class Task {
    public static void main(String[] args) {

        int inhabitants = 20;
        int day = 0;

        while (inhabitants > 0) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            day++;
        }

        System.out.println("---- EXTINCT ----");
    }
}
