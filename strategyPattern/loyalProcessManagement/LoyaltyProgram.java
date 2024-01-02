package strategyPattern.loyalProcessManagement;

import strategyPattern.loyalProcessManagement.loyalPoints.FrequencyStrategy;
import strategyPattern.loyalProcessManagement.loyalPoints.LoyaltyPointsStrategy;
// import strategyPattern.loyalProcessManagement.loyalPoints.PromotionBasedStrategy;

public class LoyaltyProgram {
    
    public static void main(String[] args) {
        LoyaltyPointsStrategy loyaltyPoints;
        loyaltyPoints = new FrequencyStrategy();
        System.out.println(" your loyalty amounts is: "+loyaltyPoints.calculateLoyaltyPoints(10000));
    }
}
