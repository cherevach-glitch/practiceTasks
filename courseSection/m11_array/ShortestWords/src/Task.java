import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(shortestWords(
                "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray"
        )));


        System.out.println(Arrays.toString(shortestWords(
                "spare, decrease, morning, article, chaos, orbit, acceptance, lodge, tournament, trade"
        )));

    }

    public static String[] shortestWords(String str) {

        String[] words = str.split(", ");
        int minLength = words[0].length();

        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() == minLength) {
                result.add(word);
            }
        }


        return result.toArray(new String[0]);
    }
}
