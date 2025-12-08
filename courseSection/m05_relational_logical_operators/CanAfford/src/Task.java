public class Task {
    public static void main(String[] args) {

        double accountBalance = 350.0;
        double itemPrice = 254.99;

        boolean canAfford = accountBalance >= itemPrice;

        System.out.println("canAfford = " + canAfford);
    }
}
