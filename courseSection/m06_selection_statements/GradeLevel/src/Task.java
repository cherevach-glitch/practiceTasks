public class Task {

    public static void main(String[] args) {

        int age = 8;
        if (age < 3) {
            System.out.println("ineligible");
        } else if (age <= 4) {
            System.out.println("preschool");
        } else if (age == 5) {
            System.out.println("kindergarten");
        } else if (age <= 10) {
            System.out.println("elementary");
        } else if (age <= 13) {
            System.out.println("middle school");
        } else if (age <= 18) {
            System.out.println("high school");
        } else {
            System.out.println("college");
        }
    }
}
