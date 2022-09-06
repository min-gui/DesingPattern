package strategy.custom;

public abstract class Car {
    private MoveStrategy moveStrategy;
    private TireStrategy tireStrategy;
    abstract void display();

    public Car(MoveStrategy moveStrategy,
               TireStrategy tireStrategy) {
        this.moveStrategy = moveStrategy;
        this.tireStrategy = tireStrategy;
    }

    public void move(){
        moveStrategy.move();
    }

    public void tire(){
        tireStrategy.tire();
    }

    //전략 상호 교환
    public void setMoveStraegy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setTireStrategy(TireStrategy tireStrategy) {
        this.tireStrategy = tireStrategy;
    }
}
