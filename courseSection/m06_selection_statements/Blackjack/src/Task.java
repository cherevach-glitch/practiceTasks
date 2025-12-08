public class Task {

    public static void main(String[] args) {

        int house = 8;
        int player = 21;

        if (player > 21) {
            System.out.println("player bust");
        } else if (player == house) {
            System.out.println("its a tie");
        } else if (player == 21) {
            System.out.println("player win");
        } else if (house > player) {
            System.out.println("player lose");
        } else {
            System.out.println("player win");
        }
    }
}
