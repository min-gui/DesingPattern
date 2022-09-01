package command;

public class Client {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();

        HeatherOnCommand heatherOnCommand = new HeatherOnCommand(heater);
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);

        OkGoogle okGoogle = new OkGoogle();

        okGoogle.setCommand(heatherOnCommand);
        okGoogle.talk();



    }
}
