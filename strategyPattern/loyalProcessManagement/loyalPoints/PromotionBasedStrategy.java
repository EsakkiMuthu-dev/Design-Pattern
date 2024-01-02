package strategyPattern.loyalProcessManagement.loyalPoints;

public class PromotionBasedStrategy  implements LoyaltyPointsStrategy
{
    boolean isPromted;
    @Override
    public int calculateLoyaltyPoints(int amount)
    {
        // Add your implementation here
        return isPromted?100:0;
    }
    
}
