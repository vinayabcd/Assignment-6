import java.util.Scanner;

public class Librarycharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of late days: ");
        int no_of_latedays = sc.nextInt();

        if (no_of_latedays <= 7) {
            System.out.println("charged for 50 paise fine");
        } else if (no_of_latedays <= 14) {
            System.out.println("charged for rs.1/-");
        } else if (no_of_latedays > 14) {
            System.out.println("charged for rs.5/-");
        } else {
            System.out.println("you lost your membership");
        }
        sc.close();
    }

}
