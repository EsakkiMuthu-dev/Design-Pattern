package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl();

        TurnOffCmd onCommand = new TurnOffCmd(tv);
        TurnOnCmd offCommand = new TurnOnCmd(tv);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
