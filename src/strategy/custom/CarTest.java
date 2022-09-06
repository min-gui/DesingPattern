package strategy.custom;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("-------출발------");
        Car sedanCar = new SedanCar();
        sedanCar.display();
        sedanCar.move();
        sedanCar.tire();
        System.out.println("-------------");
        Car sportsCar = new SportsCar();
        sportsCar.display();
        sportsCar.move();
        sportsCar.tire();
        System.out.println("-------------");
        Car suvCar = new SuvCar();
        suvCar.display();
        suvCar.move();
        suvCar.tire();


        System.out.println("-------------");
        System.out.println("------비가내린다-------");
        //알고리즘들을 해당 계열 안에서 상호 교체가 가능하게 만든다
        sedanCar.setTireStrategy(new RainTire());
        sedanCar.display();
        sedanCar.tire();

        sportsCar.setTireStrategy(new RainTire());
        sportsCar.display();
        sportsCar.tire();

        suvCar.setTireStrategy(new RainTire());
        suvCar.display();
        suvCar.tire();

    }
}
