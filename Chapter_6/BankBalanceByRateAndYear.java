

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankBalanceByRateAndYear {

    public static void main(String[] args) {
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};
        
        final int MAX_YEARS = 4;
        
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        double initialBalance = scanner.nextDouble();
        scanner.close();

        for (double rate : interestRates) {
            
            System.out.println("\nWith an initial balance of $" + df.format(initialBalance) + 
                               " at an interest rate of " + df.format(rate * 100) + "%");
            
            double currentBalance = initialBalance;
            
            for (int year = 1; year <= MAX_YEARS; year++) {
                
                currentBalance = currentBalance * (1 + rate);
                
                System.out.println("After year " + year + " balance is $" + df.format(currentBalance));
            }
        }
    }
}