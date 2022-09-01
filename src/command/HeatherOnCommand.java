package command;

public class HeatherOnCommand implements Command{

    private Heater heater;

    public HeatherOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void run() {
        heater.powerOn();
    }
}
