package factory.myCustom;

public class AnimalMainTest {
    public static void main(String[] args) {
        AnimalFactory sAnimalFactory = new SeoulAnimalFactory();
        AnimalFactory dAnimalFactory = new DeajeonAnimalFactory();
        sAnimalFactory.createAnimal(new Lion());
        sAnimalFactory.createAnimal(new Fox());
        sAnimalFactory.createAnimal(new Tiger());
        dAnimalFactory.createAnimal(new Fox());




    }
}
