public class Task {

    public static void main(String[] args) {

        int outsideTemperature = 92;
        int shelfLife = 10;

        if (outsideTemperature > 90) {
            shelfLife -= 4;
        }

        System.out.println("shelfLife = " + shelfLife);
    }
}
