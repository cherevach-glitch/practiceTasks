public class Task {

    public static void main(String[] args) {

        int soldYesterday = 92;
        int soldToday = 105;

        int salesTrend;

        if (soldToday >= soldYesterday) {
            salesTrend = 1;
        } else {
            salesTrend = -1;
        }

        System.out.println("salesTrend = " + salesTrend);
    }
}
