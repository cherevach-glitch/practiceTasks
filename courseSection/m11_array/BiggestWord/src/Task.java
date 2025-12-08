public class Task {

    public static void main(String[] args) {

        String[] words1 = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        System.out.println(longestWord(words1));

        String[] words2 = {"five5", "six666", "one1111111111111", "2two", "four4444"};
        System.out.println(longestWord(words2));
    }

    public static String longestWord(String[] words) {

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
