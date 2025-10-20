


import java.util.Scanner;

public class Bank_Balance {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final double balance;
        int day = 365;
        int procceed = 0;
        int year = 1;
        double calculated = 0;
        double interest_rate = 0.03;
        int Continue = 0;
        int YES = 0;
        int next;
        int follow, follow1;
        System.out.print("Enter initial Bank Balance: >> ");
        balance = input.nextDouble();
        System.out.print("Do you want to see next year's balance?");
        System.out.print("\nEnter 1 for YES, or any Number for no >> ");
        procceed = input.nextInt();
           if(procceed == 1) {  
                    Continue += 1;
                 while (Continue == 1) {
                 calculated = balance * interest_rate * year;
                    calculated += balance;        
              System.out.print("After year 1 at " + interest_rate + " interest rate, balance is: " + calculated + "\n\n");  

                   if(Continue == 1) {
                        System.out.print("Do you want to see the balance at the of the year?");
                        System.out.print("\nEnter 1 for YES, or any Number for no >> ");
                            follow = input.nextInt();
                          calculated = balance * interest_rate * year;
                          calculated += balance;     
                          if(follow == 1) {   
                                 System.out.print("Enter initial Bank Balance: >> ");
                                  double balance1 = input.nextDouble();
                                  System.out.print("Do you want to see next year's balance?");
                                  System.out.print("\nEnter 1 for YES, or any Number for no >> ");
                                   follow = input.nextInt();
                                    calculated = balance1 * interest_rate * year;
                                    calculated += balance1;   
                             System.out.print("After year 1 at " + interest_rate + " interest rate, balance is: " + calculated + "\n\n");    

                          } else {
                            break;
                          }
                } else {
                     if(Continue > 2 || Continue == 0) {
                        break;
                    }
                } 
                 // End for if statement
                 }  
                 
            } else {

             Continue += 1;
            while(Continue == 1) {
                 
                    if(Continue == 1) {
                    System.out.print("\nDo you want to see next year's balance?");
                    System.out.print("\nEnter 1 for YES, or any Number for no >> ");
                        follow1 = input.nextInt();
                         calculated = balance * interest_rate * year;
                         calculated += balance;        
                  System.out.print("After year 1 at " + interest_rate + "interest rate, balance is: " + calculated + "\n\n");   

                   if(follow1 == 1) {
                        System.out.print("Do you want to see the balance at the of the year?");
                        System.out.print("\nEnter 1 for YES, or any Number for no >> ");
                            follow1 = input.nextInt();
                          calculated = balance * interest_rate * year;
                          calculated += balance;  
                          if(follow1 == 1) {      
                          System.out.print("\nAfter year 1 at " + interest_rate + " interest rate, balance is: " + calculated + "\n\n");   
                          } 
                            else {
                                break;
                            }
                } else {
                     if(follow1 > 2 || follow1 == 0) {
                        break;
                    }
                } 
                         
                } else {
                    if(Continue > 2 || Continue == 0) {
                        break;
                    }
                } 
               
            }
        }
        // End for else statement     
    
    }

}