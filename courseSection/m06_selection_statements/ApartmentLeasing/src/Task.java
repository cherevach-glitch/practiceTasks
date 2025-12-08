import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");

        int numberOfBedrooms = input.nextInt();

        if (numberOfBedrooms == 1) {
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: 1100");
        } else if (numberOfBedrooms == 2) {
            System.out.println("Two Bedroom Selected");
            System.out.println("Starting Price: 1850");
        } else if (numberOfBedrooms == 3) {
            System.out.println("Three Bedroom Selected");
            System.out.println("Starting Price: 2550");
        } else {
            System.out.println("Sorry, we do not offer that many bedrooms");
        }
    }
}
