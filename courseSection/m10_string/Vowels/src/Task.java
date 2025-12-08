public class Task {

    public static void printVowels(String word) {

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {

        printVowels("howdyho");
        System.out.println();

        printVowels("java");
        System.out.println();

        printVowels("apple");
    }
}
