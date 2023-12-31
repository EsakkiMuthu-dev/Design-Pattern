package strategyPattern;


public class PayByUPI implements PaymentStrategy {
    @Override
    public void pay( int amount) {
        // Add your implementation here
        System.out.println( amount + "Paid using UPI");
    }
}