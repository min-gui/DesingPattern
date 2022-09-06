package strategy.custom;

public class RainTire implements TireStrategy {
    @Override
    public void tire() {
        System.out.println("레인 타이어");
    }
}
