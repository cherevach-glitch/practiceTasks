public class Task {

    public static void main(String[] args) {

        int first = 5;
        int second = 10;
        int third = 7;

        int middle;

        if ((first > second && first < third) || (first < second && first > third)) {
            middle = first;
        } else if ((second > first && second < third) || (second < first && second > third)) {
            middle = second;
        } else {
            middle = third;
        }

        System.out.println("middle number = " + middle);
    }
}
