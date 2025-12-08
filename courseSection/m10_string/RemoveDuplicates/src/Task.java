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
            }

            System.out.println("Do you want to enter another guest's name?");
            answer = input.nextLine();

        } while (answer.equalsIgnoreCase("yes"));


        System.out.print("Guests' list: ");
        for (int i = 0; i < guests.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(guests.get(i));
        }
    }
}



