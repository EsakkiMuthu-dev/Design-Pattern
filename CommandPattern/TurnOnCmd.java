package CommandPattern;

public class TurnOnCmd implements Command {
    private Device device;
    public TurnOnCmd(Device device)
    {
        this.device= device;
    }
    public void execute()
    {
        device.turnOn();
    }
    
}
