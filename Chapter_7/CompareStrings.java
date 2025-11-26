
import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        final String PREDEFINED_NAME = "Carmen";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name > ");

        String inputName = scanner.nextLine();

        if (PREDEFINED_NAME.equals(inputName)) {
            System.out.println(PREDEFINED_NAME + " equals " + PREDEFINED_NAME);
        } else {
            System.out.println(PREDEFINED_NAME + " does not equal " + inputName);
        }

        scanner.close();
    }
}