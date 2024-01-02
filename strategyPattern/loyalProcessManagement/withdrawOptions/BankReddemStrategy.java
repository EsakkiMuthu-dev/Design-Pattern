package strategyPattern.loyalProcessManagement.withdrawOptions;

public class BankReddemStrategy implements RedeemStrategy
{
    @Override
    public int redeem(int amount)  
    {
        // Add your implementation here
        System.out.println("Transcations are going on with Bank \n \n");
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
