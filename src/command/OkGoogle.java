package command;

public class OkGoogle {


    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void talk(){
        command.run();
    }
    /*private static String[] modes = {"heater", "lamp"};
    private Heater heater;
    private Lamp lamp;
    private String mode;

    public OkGoogle(Heater heater, Lamp lamp) {
        this.heater = heater;
        this.lamp = lamp;
    }

    public void setMode(int i){
        this.mode = modes[i];
    }

    public void talk(){
        switch (this.mode){
            case "heater":
                this.heater.powerOn();
                break;
            case "lamp":
                this.lamp.turnOn();
                break;
        }
    }*/
}
