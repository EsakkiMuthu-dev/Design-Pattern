package strategyPattern.learning;

public class Checkout {
    PaymentStrategy paymentStrategy;
    int amount;
    // Constructor 
    public Checkout(PaymentStrategy paymentStrategy, int amount)
    {
        this.paymentStrategy =paymentStrategy;
        this.amount=amount;
    }
    public void checkout()
    {
        paymentStrategy.pay(amount);
    }
}
