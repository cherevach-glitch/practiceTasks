public class Task {
    public static void main(String[] args) {

        int year = 2000;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
