package strategyPattern.loyalProcessManagement.withdrawOptions;

public class CouponRedeemStrategy implements RedeemStrategy {
    
    public int redeem(int amount)
    {
        // Add your implementation here
        System.out.println("Coupons are getting Ready!!! \n \n");
        for(int i=0;i<5;i++)
        {
            System.out.println(" ...............................\n \n");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return amount;
    }
}
