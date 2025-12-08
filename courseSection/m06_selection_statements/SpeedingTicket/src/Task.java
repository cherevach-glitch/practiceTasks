public class Task {

    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeed = 85;

        if (currentSpeed > speedLimit) {

            int milesOverLimit = currentSpeed - speedLimit;
            int ticketAmount = milesOverLimit * 6 + 51;

            System.out.println("ticketAmount = $" + ticketAmount);

        } else {
            System.out.println("Not speeding");
        }
    }
}
