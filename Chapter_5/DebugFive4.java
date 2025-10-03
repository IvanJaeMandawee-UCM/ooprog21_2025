
import java.util.Scanner;

public class DebugFive4 {

    public static void main(String args[]) {

        int one, two, three, four;
        int highest = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        one = input.nextInt();
        System.out.print("Enter Integer: ");
        two = input.nextInt();
        System.out.print("Enter Integer: ");
        three = input.nextInt();
        System.out.print("Enter Integer: ");
        four = input.nextInt();

        if (one > two && one > three && one > four) {
            highest = one;
        } else if (two > one && two > three && two > four) {
            highest = two;
        } else if (three > one && three > two && three > four) {
            highest = three;
        } else {
            highest = four;
        }

        System.out.print("The Highest number is: " + highest);

    }

}