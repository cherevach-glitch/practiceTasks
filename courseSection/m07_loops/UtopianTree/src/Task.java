public class Task {
    public static void main(String[] args) {

        int treeSize = 0;

        for (int year = 1; year <= 10; year++) {

            int growth;

            if (year <= 3) {
                growth = 1;
            } else {
                growth = 2;
            }

            treeSize += growth;

            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + " cm");
        }
    }
}
