package strategy.custom;

public class AnyGo implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("모든도로 지나간다.");
    }
}
