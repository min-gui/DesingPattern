package factory.myCustom;

public class Fox extends Animal{
    @Override
    public String getBark() {
        return "꿔꿔꿔";
    }

    @Override
    public String getLive() {
        return "살아있음";
    }

    @Override
    public String getAnimalType() {
        return "여우";
    }
}
