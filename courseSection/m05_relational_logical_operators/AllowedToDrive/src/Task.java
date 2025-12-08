public class Task {
    public static void main(String[] args) {

        int age = 16;
        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean allowedToDrive =
                (age >= 18 && hasDriverLicense) ||
                        (age >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike allowed to drive? " + allowedToDrive);
    }
}
