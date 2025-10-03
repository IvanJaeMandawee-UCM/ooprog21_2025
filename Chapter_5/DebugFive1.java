
import java.util.Scanner;

public class DebugFive1 {

    public static void main(String args[]) {

        Scanner kb = new Scanner(System.in);

        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;

        int usersChoice;
        double bill = 0;

        System.out.print("Order please: 1 - Burger, 2 - Hotdog");
        System.out.print("3 - Grilled Cheese, 4 - Fish sandwich: ");
        usersChoice = kb.nextInt();

        if (usersChoice == 1 || usersChoice == 2) {
            bill += HIGH_PRICE;
        } else {
            bill += MED_PRICE;
        }
        System.out.print("Fries with that?, 1 - Yes, 2 - No: ");
        usersChoice = kb.nextInt();
        if (usersChoice == 1) {
            bill += LOW_PRICE;
        } else {
            bill += 0;
        }

        System.out.print("Total bill is: " + bill);

    }

}