package strategyPattern.learning;

public class PayByCreditCard implements PaymentStrategy
{
    @Override
    public void pay(int amount)
    {
        System.out.println( amount +" paid using Credit Card");
    }
    
}
