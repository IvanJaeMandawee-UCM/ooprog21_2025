

import java.util.Scanner;

public class BankBalance2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double RATE = 0.03; 
        
        double balance = 103.00; 
        
        int year = 1; 
        
        int choice;

        do {
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >> ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                choice = 0;
                scanner.next(); 
            }
            
            if (choice == 1) {
                year++;
                
                balance = balance * (1 + RATE);

                System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", 
                                  year, RATE, balance);
            }
            
        } while (choice == 1);
        
      
        scanner.close();
    }
}
