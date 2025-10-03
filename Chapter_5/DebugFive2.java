
import java.util.Scanner;

public class DebugFive2 {

    public static void main(String args[]) {

        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        System.out.print("Enter Another Number: ");
        num2 = input.nextInt();

        if ((num % num2) == 0 || (num2 / num) == 0) {
            System.out.print("One of these numbers is");
            System.out.print(" evenly divisible into the other");
        } else {
            System.out.print("Neither of these numbers is");
            System.out.print(" evenly dividible into the other");
        }

    }
}