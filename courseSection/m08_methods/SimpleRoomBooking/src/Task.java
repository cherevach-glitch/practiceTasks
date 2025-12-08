public class Task {

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {


        if (!isAvailable) {
            return false;
        }

        if (year != 2018) {
            return false;
        }

        if (month == 7 && day >= 1 && day <= 8) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(simpleRoomBook(false, 2, 1, 2018));
        System.out.println(simpleRoomBook(true, 2, 1, 2018));
        System.out.println(simpleRoomBook(true, 2, 1, 2022));
        System.out.println(simpleRoomBook(true, 7, 1, 2018));
        System.out.println(simpleRoomBook(true, 7, 9, 2018));
    }
}
