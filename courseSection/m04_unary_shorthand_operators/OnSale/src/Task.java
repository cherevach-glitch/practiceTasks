public class Task {
    public static void main(String[] args) {

        double currentPrice = 50.0;
        double discountPercentage = 5;
        double discountAmount = currentPrice * (discountPercentage / 100);

        currentPrice -= discountAmount;

        System.out.println("discountAmount = " + discountAmount);
        System.out.println("currentPrice = " + currentPrice);
    }
}
