public class Task {
    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "San Fransisco";

        double oneWayFare = 643.5;

        char DOLLAR = '\u0024'; // Unicode для $

        System.out.println(
                "From " + city1 +
                        " to " + city2 +
                        " one way cost is " +
                        DOLLAR + oneWayFare
        );
    }
}
