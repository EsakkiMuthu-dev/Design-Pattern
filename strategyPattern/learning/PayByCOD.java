package strategyPattern.learning;

public class PayByCOD implements PaymentStrategy
{
    @Override
    public void pay( int amount)
    {
        System.out.println( amount + " paid using sCOD");
    }
    
}
