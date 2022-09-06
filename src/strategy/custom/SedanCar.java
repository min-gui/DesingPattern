package strategy.custom;

public class SedanCar extends Car{

    public SedanCar() {
        super(new AnyGo(),new NormalTire());
    }

    @Override
    void display() {
        System.out.println("세단 카");
    }
}
