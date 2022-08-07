package factory.myCustom;

public class Lion extends Animal{
    @Override
    public String getBark() {
        return "콰악";
    }

    @Override
    public String getLive() {
        return "죽었음";
    }

    @Override
    public String getAnimalType() {
        return "사자";
    }
}
