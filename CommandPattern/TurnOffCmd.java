package CommandPattern;

public class TurnOffCmd implements Command {
    private Device device;
    public TurnOffCmd(Device device)
    {
        this.device= device;
    }
    public void execute()
    {
        device.turnOff();
    }
    
}
