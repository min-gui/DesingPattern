package templateMethod;

public class Tee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("티 우려내는중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 추가");
    }
}
