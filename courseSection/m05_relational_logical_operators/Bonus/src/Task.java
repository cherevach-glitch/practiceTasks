public class Task {
    public static void main(String[] args) {

        int yearsWithCompany = 5;
        int department = 10;

        boolean hasBonus = yearsWithCompany >= 5 && (department == 10 || department == 15);

        System.out.println("hasBonus = " + hasBonus);
    }
}
