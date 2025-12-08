import java.util.ArrayList;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();

        String answer;

        do {
            System.out.println("Please enter the guest's name:");
            String name = input.nextLine();

            if (!guests.contains(name)) {
                guests.add(name);
            } else {
                System.out.println("This guest is already in the list.");
            }

            System.out.println("Do you want to enter another guest's name?");
            answer = input.nextLine();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Guests' list: " + String.join(", ", guests));
    }
}
