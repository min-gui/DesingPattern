package factory.myCustom;

public abstract class AnimalFactory {
    //인스턴스를 주입 해주는 역할.
    abstract Animal createAnimal(Animal animal);
}
