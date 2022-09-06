package strategy.custom;

public class SnowTire implements TireStrategy{
    @Override
    public void tire() {
        System.out.println("스노우 타이어");
    }
}
