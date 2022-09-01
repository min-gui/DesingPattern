package templateMethod;

public abstract class CaffeineBeverage {

    //하위 클래스에서 음료 제조 방법 변경할 수 없게 final
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()){
            addCondiments();
        }

    }


    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("끓이는중");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    //hook 별 내용이 없는 메서드
    boolean customerWantsCondiments(){
        return true;
    }
}
