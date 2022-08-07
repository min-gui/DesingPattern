package factory.myCustom;

public class Tiger extends Animal{

    @Override
    public String getBark() {
        return "어흥";
    }

    @Override
    public String getLive() {
        return "살아있어";
    }

    @Override
    public String getAnimalType() {
        return "랑이";
    }
}
