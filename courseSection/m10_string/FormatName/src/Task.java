public class Task {

    public static void main(String[] args) {

        System.out.println(formatName("CADEN ARROYO"));
        System.out.println(formatName("zOIe neLSOn"));
        System.out.println(formatName("Mara Blair"));
        System.out.println(formatName("jax wOLF"));
    }

    public static String formatName(String name) {

        String[] words = name.toLowerCase().split(" ");
        String result = "";

        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }

        return result.trim();
    }
}
