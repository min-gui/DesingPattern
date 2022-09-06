package strategy.custom;

public class SportsCar extends Car{

    public SportsCar() {
        super(new TunnelGo(), new NormalTire());
    }

    @Override
    void display() {
        System.out.println("스포츠카");
    }

}
