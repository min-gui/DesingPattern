package strategy.custom;

public class SuvCar extends Car{

    public SuvCar() {
        super(new BumpGo(), new NormalTire());
    }

    @Override
    void display() {
        System.out.println("suv 카");
    }
}
