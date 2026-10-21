import java.util.Scanner;

public class IT26510618Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int start = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = input.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Dates must be between 1 and 31");
            input.close();
            return;
        }

        if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int days = end - start;
        double total = days * ROOM_CHARGE;

        if (days >= 5) {
            total = total - (total * DISCOUNT_20);
        } else if (days >= 3) {
            total = total - (total * DISCOUNT_10);
        }

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE);
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);

        input.close();
    }
}