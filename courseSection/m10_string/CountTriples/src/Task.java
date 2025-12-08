public class Task {

    public static void main(String[] args) {

        System.out.println(countTriples("abcXXXabc"));   // 1
        System.out.println(countTriples("xxxabyyyycd")); // 3
        System.out.println(countTriples("java"));        // 0
    }

    public static int countTriples(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            char current = str.charAt(i);

            if (str.charAt(i + 1) == current && str.charAt(i + 2) == current) {
                count++;
            }
        }

        return count;
    }
}
