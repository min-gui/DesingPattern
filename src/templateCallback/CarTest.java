package templateCallback;

class CarTest {
    public static void main(String[] args) {
        System.out.println("-------출발------");
        Car sedanCar = new SedanCar();
        sedanCar.takeMove("모든도로");
        sedanCar.takeTire("보통 타이어");

        System.out.println("-------------");
        Car sportsCar = new SportsCar();
        sportsCar.takeMove("방지턱 X, 터널 o");
        sportsCar.takeTire("보통 타이어");

        System.out.println("-------------");
        Car suvCar = new SuvCar();
        suvCar.takeMove("터널 X, 방지턱 o");
        suvCar.takeTire("보통 타이어");


        System.out.println("-------------");
        System.out.println("------비가내린다-------");

        sedanCar.takeTire("레인 타이어");
        sportsCar.takeTire("레인 타이어");
        suvCar.takeTire("레인 타이어");


    }
}
