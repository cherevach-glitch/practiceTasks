
public class Task {

    public static void main(String[] args) {

        System.out.println(sameCount("We study java not python"));
        System.out.println(sameCount("What's the difference between java, javascript and python?"));
        System.out.println(sameCount("java python hello python world python"));
    }

    public static boolean sameCount(String str) {

        str = str.toLowerCase();

        int javaCount = 0;
        int pythonCount = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 4).equals("java")) {
                javaCount++;
            }
        }

        for (int i = 0; i <= str.length() - 6; i++) {
            if (str.substring(i, i + 6).equals("python")) {
                pythonCount++;
            }
        }

        return javaCount == pythonCount;
    }
}
