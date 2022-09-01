package templateMethod.custom;

public abstract class HomeKitchen {

    //final 하위클래스에서 조작하지 못하게해 순서 보장
    public final void execute(){
        preparePot();
        addWater();
        addIngredient();
        movePot();
    }

    abstract void addIngredient();

    void preparePot(){
        System.out.println("냄비를 올린다.");
    }

    void addWater(){
        System.out.println("물을 넣는다.");
    }

    void movePot(){
        System.out.println("냄비를 식탁으로 옮긴다.");
    }
}
