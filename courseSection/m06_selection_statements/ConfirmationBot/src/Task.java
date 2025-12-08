import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter command:");
        char response = input.next().charAt(0);

        switch (response) {
            case 'y':
                System.out.println("Your request is being processed");
                break;

            case 'n':
                System.out.println("Thank you for your consideration");
                break;

            case 'h':
                System.out.println("Sorry, no live agents are currently available");
                break;

            default:
                System.out.println("Invalid entry, please try again");
        }
    }
}
