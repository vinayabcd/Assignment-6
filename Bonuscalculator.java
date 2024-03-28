import java.util.Scanner;

public class Bonuscalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        int current_year = sc.nextInt();
        System.out.println("Enter the joined year: ");
        int joined_year = sc.nextInt();

        int Yearsof_Experience = current_year - joined_year;

        if (Yearsof_Experience > 5) {
            System.out.println("Bonus:rs.5000/-");
        } else if (Yearsof_Experience > 3) {
            System.out.println("Bonus : rs.3000/-");
        } else {
            System.out.println("not eligible for bonus");
        }
        sc.close();

    }

}
