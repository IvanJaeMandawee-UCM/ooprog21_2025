
import java.util.Arrays;

public class ArraysDemo {

    public static void display(String message, int[] array) {
        System.out.print(message);

        for (int start = 0; start < array.length; start++) {

            if (start > 0) {
                System.out.print(" ");
            }
            System.out.print(array[start]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        output();
    }

    public static void output() {
        int[] line_array = new int[5];

        display("Original array: \t\t", line_array);

        Arrays.fill(line_array, 8);
        display("After filling with 8s: \t\t", line_array);

        line_array[2] = 6;
        line_array[4] = 3;
        display("After changing two values: \t", line_array);

        Arrays.sort(line_array);
        display("After sorting: \t\t\t", line_array);

        System.out.print("Operation complete.");
    }
}
