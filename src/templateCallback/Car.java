package templateCallback;

abstract class Car {
    abstract void display();

    void takeTire(String tireName){
        System.out.println("+-+-+-+-+-+-");
        display();
        changeTire(tireName).tire();
        System.out.println("출발");
    }

    void takeMove(String moveName){
        System.out.println("+-+-+-+-+-+-");
        changeMove(moveName).move();
        System.out.println("통과");
    }

    private TireStrategy changeTire(String tireName){
        return new TireStrategy() {
            @Override
            public void tire() {
                System.out.println(tireName + " 장착");
            }
        };
    }

    private MoveStrategy changeMove(String moveName){
        return new MoveStrategy() {
            @Override
            public void move() {
                System.out.println(moveName + " (이용 가능한 도로)");
            }
        };
    }

}
