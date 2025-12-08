import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(swap(list1, 0, 2));

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "c", "b", "d", "e"));
        System.out.println(swap(list2, 0, 3));
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        String temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);

        return list;
    }
}
