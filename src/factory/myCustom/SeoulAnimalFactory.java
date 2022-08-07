package factory.myCustom;

public class SeoulAnimalFactory extends AnimalFactory{
    @Override
    Animal createAnimal(Animal animal) {
        System.out.println("--서울 동물원 -- \n"
                +animal.getAnimalType() +" "
                +animal.getBark() );
        return animal;
    }
}
