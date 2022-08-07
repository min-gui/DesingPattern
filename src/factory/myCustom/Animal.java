package factory.myCustom;

abstract public class Animal {

    public abstract String getBark();
    public abstract String getLive();

    public abstract String getAnimalType();

    private String TYPE = "동물";

    @Override
    public String toString() {
        return String.format("%s 나의 울음 소리는 %s %s",
                this.TYPE,
                this.getBark(),
                this.getLive());
    }
}
