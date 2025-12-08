public class Task {

    public static void main(String[] args) {

        char size = 'L';
        char addPepperoni = 'Y';
        char extraCheese = 'Y';

        double totalPrice = 0;


        if (size == 'S') {
            totalPrice = 13.99;

            if (addPepperoni == 'Y') {
                totalPrice += 1.50;
            }
            if (extraCheese == 'Y') {
                totalPrice += 1.25;
            }

        } else if (size == 'M') {
            totalPrice = 15.99;

            if (addPepperoni == 'Y') {
                totalPrice += 1.90;
            }
            if (extraCheese == 'Y') {
                totalPrice += 1.65;
            }

        } else if (size == 'L') {
            totalPrice = 18.79;

            if (addPepperoni == 'Y') {
                totalPrice += 2.10;
            }
            if (extraCheese == 'Y') {
                totalPrice += 2.00;
            }

        } else {
            System.out.println("Invalid pizza size");
            return;
        }

        System.out.println("Total price: $" + totalPrice);
    }
}
