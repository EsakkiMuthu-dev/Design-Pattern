package strategyPattern.loyalProcessManagement.loyalPoints;

public class FrequencyStrategy implements LoyaltyPointsStrategy
{

    //Calculate loyalty points for frequent customers
    //10 points for every dollar spent
    int frequencies;
    @Override
    public int calculateLoyaltyPoints(int amount)
    {
        return amount * 10;
    }
    
}
