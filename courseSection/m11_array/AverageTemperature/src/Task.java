public class Task {

    public static void main(String[] args) {

        double[] temps = {80.0, 88.0, 88.0, 84.0, 82.0, 78.0, 60.0, 68.0};

        System.out.println(averageTemperature(temps));
    }

    public static double averageTemperature(double[] temperatures) {

        double sum = 0;

        for (double temp : temperatures) {
            sum += temp;
        }

        return sum / temperatures.length;
    }
}
