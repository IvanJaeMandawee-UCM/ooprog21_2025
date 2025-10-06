
import java.util.Scanner;

public class Payroll {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int hour_works_week;
        int employees = 1;
        double pay_rate = 0, regularPay, overtimePay;
        System.out.print("How many did you work for this week? >> ");
        hour_works_week = input.nextInt();

        if (hour_works_week >= 1) {
            System.out.print("What is your regulay pay? >> ");
            pay_rate = input.nextDouble();
        } else {
            hour_works_week = 0;
            pay_rate = 0;
            System.out.print("Did not ever worked\n");
            input.close();
        }

        Employee worker = new Employee(employees, pay_rate);

        regularPay = worker.calculate_regularPay(hour_works_week);
        overtimePay = worker.calculate_overtimePay(hour_works_week);

        System.out.print("Regular Pay is: " + regularPay);
        System.out.print("\nOvertime Pay is: " + overtimePay);

        input.close();
    }

}