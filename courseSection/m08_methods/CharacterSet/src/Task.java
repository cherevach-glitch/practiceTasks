public class Task {

    public static String getCharacterSet(char start, char end) {
        String result = "";

        for (char c = start; c <= end; c++) {
            result += c;
        }

        return result;
    }

    public static String getCharacterSet(String group) {

        switch (group.toLowerCase()) {
            case "uppercase":
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            case "lowercase":
                return "abcdefghijklmnopqrstuvwxyz";

            case "digit":
                return "0123456789";

            case "special":
                return "!\"#$%&'()*+,-.";

            default:
                return "";
        }
    }

    public static void main(String[] args) {

        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet('X', '}'));

        System.out.println(getCharacterSet("uppercase"));
        System.out.println(getCharacterSet("lowercase"));
        System.out.println(getCharacterSet("digit"));
        System.out.println(getCharacterSet("special"));
    }
}
