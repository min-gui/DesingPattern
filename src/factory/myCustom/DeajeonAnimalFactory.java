package factory.myCustom;

public class DeajeonAnimalFactory extends AnimalFactory{
    @Override
    Animal createAnimal(Animal animal) {
        System.out.println("--대전 동물원 -- \n"
                +animal.getAnimalType() +" "
                +animal.getBark() );
        return animal;
    }
}
