
public class Task {

    public static int wordCount(String words) {

        String[] arr = words.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {

        System.out.println(wordCount("one two three"));
        System.out.println(wordCount("foo bar"));
        System.out.println(wordCount("hello world java"));
    }
}
