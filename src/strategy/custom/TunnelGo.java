package strategy.custom;

public class TunnelGo implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("터널 지나간다. 방지턱 못넘는다.");
    }
}
