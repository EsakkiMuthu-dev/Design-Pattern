package strategyPattern;

import java.util.Scanner;

/**
 * StrategyPattern
 */
public class StrategyPattern {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = input.nextInt();

        System.out.print("Enter the payment method (1 for COD, 2 for Credit Card, 3 for UPI): ");
        int paymentMethod = input.nextInt();

        // Create a Checkout object with the selected payment strategy
        PaymentStrategy strategy;
        if (paymentMethod == 1) {
            strategy = new PayByCOD();
        } else if (paymentMethod == 2) {
            strategy = new PayByCreditCard();
        } else if (paymentMethod == 3) {
            strategy = new PayByUPI();
        } else {
            System.out.println("Invalid payment method");
            input.close();
            return;
        }

        Checkout checkout = new Checkout(strategy, amount);
        checkout.checkout();

        input.close();
    }    
        
}