public class Task {

    public static void main(String[] args) {

        System.out.println(extractNum("aa2aa3"));
        System.out.println(extractNum("aa!%$#.10aa"));

    }

    public static String extractNum(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                result += ch;
            }
        }

        return result;
    }
}
