package Atm;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationimpl op = new AtmOperationimpl();
        int Atmnumber=83744;
        int AtmPin = 1549;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter the ATM number: ");
        int AtmNumber = in.nextInt();
        System.out.print("Enter PIN: ");
        int pin = in.nextInt();
        
      
        if ((Atmnumber == AtmNumber) && (AtmPin == pin)) {
            while (true) {
                System.out.println("\n1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");   
                System.out.print("Enter Choice: ");
                int ch = in.nextInt();
                
                switch (ch) {
                    case 1:
                        op.viewBalance(); 
                        break;
                        
                    case 2:
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                        
                    case 3:
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = in.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                        
                    case 4:
                        op.viewMiniStatement();
                        break;
                        
                    case 5:
                        System.out.println("Collect Your ATM Card\nThank You for using ATM Machine");
                        in.close(); // Close Scanner before exiting
                        System.exit(0);
                        
                    default:
                        System.out.println("Please Enter a Valid Choice.");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }
    }
}
