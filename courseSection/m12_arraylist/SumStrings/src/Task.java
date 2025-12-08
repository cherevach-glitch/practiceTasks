import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("34");
        list.add("513");

        System.out.println(sumStrings(list));
    }

    public static int sumStrings(ArrayList<String> list) {

        int sum = 0;

        for (String each : list) {
            sum += Integer.parseInt(each);
        }

        return sum;
    }
}
