public class Task {
    public static void main(String[] args) {

        int coins = 467;

        int dollars = coins / 100;
        coins = coins % 100;

        int quarters = coins / 25;
        coins = coins % 25;

        int dimes = coins / 10;
        coins = coins % 10;

        int nickels = coins / 5;
        coins = coins % 5;

        int cents = coins;

        System.out.println("coins = 467");
        System.out.println("dollars = " + dollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("cents = " + cents);
    }
}
