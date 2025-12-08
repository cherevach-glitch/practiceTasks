public class Task {

    public static String profit(int buyPrice, int sellPrice) {

        if (sellPrice > buyPrice) {
            return "profit";
        } else if (sellPrice < buyPrice) {
            return "loss";
        } else {
            return "no loss";
        }
    }

    public static void main(String[] args) {

        System.out.println(profit(100, 1500));
        System.out.println(profit(20, 5));
        System.out.println(profit(100, 100));
    }
}
