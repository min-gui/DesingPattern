package strategy.custom;

public class BumpGo implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("방지턱 넘는다. 터널 못지나간다.");
    }
}
