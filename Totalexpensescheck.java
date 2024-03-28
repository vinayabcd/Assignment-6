import java.util.Scanner;

public class Totalexpensescheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchased quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the price per item: ");
        double priceperitem = sc.nextDouble();

        double Totalexpences = quantity * priceperitem;

        if (quantity > 50) {
            Totalexpences *= 0.9;
        } else if (quantity >= 25) {
            Totalexpences *= 0.95;
        } else {
            System.out.println("no discount is offered");
        }
        System.out.println("Total exenses" + Totalexpences);
        sc.close();
    }
}
