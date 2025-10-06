
public class Employee {

    private int employees;
    private double pay_rate;
    private int pay = 40;

    public Employee(int employees, double pay_rate) {
        this.employees = employees;
        this.pay_rate = pay_rate;
    }

    public double calculate_regularPay(int hour_works_week) {

        if (hour_works_week <= pay) {
            return hour_works_week * pay_rate;
        } else {
            return 40 * pay_rate;
        }
    }

    public double calculate_overtimePay(int hour_works_week) {

        if (hour_works_week >= pay) {
            int overtime_hour = hour_works_week - pay;
            return overtime_hour * pay_rate * 1.5;
        } else {
            return 0;
        }
    }
}