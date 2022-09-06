package strategy.custom;

public class NormalTire implements TireStrategy {
    @Override
    public void tire() {
        System.out.println("일반 타이어");
    }
}
